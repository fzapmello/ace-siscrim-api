package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.SujeitoRotas;
import br.gov.pf.ditec.siscrim.entidades.Sujeito;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SujeitoService extends AbstractService {

    @Autowired
    public SujeitoRotas rotas;

   
    public Mono<Sujeito> obterSujeito(Contexto contexto, long codigoSujeito) {
        return (Mono<Sujeito>)
                webClientService.gerarRequisicaoGetMono(Sujeito.class,
                        rotas.getSujeito(),
                        contexto,
                        codigoSujeito);
    }

   
    public Flux<Sujeito> obterMateriaisNaCargaDoSujeito(Contexto contexto, long codigoSujeito, long codigoDocumento) {
        return (Flux<Sujeito>)
                webClientService.gerarRequisicaoGetFlux(Sujeito.class,
                        rotas.getObterMateriaisNaCargaDoSujeito(),
                        contexto,
                        null);
    }

}
