package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class WebClientService {

    private final WebClient webClient;

    @Autowired
    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8383/api/v1").build();
    }

    public Object gerarRequisicaoGetMono(Class<?> clazz, String uri, Contexto contexto, Object param) {
        return get(uri, contexto, param).bodyToMono(clazz).block();
    }

    public Object gerarRequisicaoGetFlux(Class<?> clazz, String uri, Contexto contexto, Object param) {
        return get(uri, contexto, param).bodyToFlux(clazz).collectList().block(Duration.ofSeconds(10L));
    }

    public Object gerarRequisicaoDelete(Class<?> clazz, String uri, Contexto contexto, Object... param) {
        return delete(uri, contexto, param).bodyToMono(clazz).block();
    }

    public Object gerarRequisicaoPut(Class<?> clazz, String uri, Contexto contexto, Object... param) {
        return put(uri, contexto, param).bodyToMono(clazz).block();
    }

    public Object gerarRequisicaoPostMono(Class<?> clazz, String uri, Contexto contexto, Object... param) {
        return post(uri, contexto, param).bodyToMono(clazz).block();
    }

    public Object gerarRequisicaoPostFlux(Class<?> clazz, String uri, Contexto contexto, Object... param) {
        return post(uri, contexto, param).bodyToFlux(clazz).collectList().block(Duration.ofSeconds(10L));
    }

    private WebClient.ResponseSpec get(String uri, Contexto contexto, Object param) {
        String token = getToken(contexto);
        return this.webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path(uri)
                        .build(param))
                .header(token)
                .retrieve();
    }

    private WebClient.ResponseSpec delete(String uri, Contexto contexto, Object param) {
        String token = getToken(contexto);

        return this.webClient
                .delete()
                .uri(uriBuilder -> uriBuilder
                        .path(uri)
                        .build(param))
                .header(token)
                .retrieve();
    }

    private WebClient.ResponseSpec put(String uri, Contexto contexto, Object... param) {
        String token = getToken(contexto);
        return this.webClient
                .put()
                .uri(uriBuilder -> uriBuilder
                        .path(uri)
                        .build())
                .body(Mono.just(gerarJson(param)), String.class)
                .header(token)
                .retrieve();
    }

    private WebClient.ResponseSpec post(String uri, Contexto contexto, Object... param)  {
        String token = getToken(contexto);
        return this.webClient
                .post()
                .uri(uriBuilder -> uriBuilder
                        .path(uri)
                        .build())
                .body(Mono.just(gerarJson(param)), String.class)
                .header(token)
                .retrieve();
    }

    private String gerarJson(Object param) {
        String objJson = null;
        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            objJson = ow.writeValueAsString(param);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return objJson;
    }

    private String getToken(Contexto contexto) {
        return contexto != null && StringUtils.isNotEmpty(contexto.getTokenJwt()) ? contexto.getTokenJwt() : null;
    }
}

