package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.UnidadeRotas;
import br.gov.pf.ditec.siscrim.entidades.UnidadeOrganizacional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UnidadeService extends AbstractService{

    @Autowired
    public UnidadeRotas rotas;

    public Mono<UnidadeOrganizacional> obterUnidade(long codigoUnidade) {
        return (Mono<UnidadeOrganizacional>)
                webClientService.gerarRequisicaoGetMono(UnidadeOrganizacional.class,
                        rotas.getUnidade(),
                        null,
                        codigoUnidade);
    }

    public Flux<UnidadeOrganizacional> listarUnidades() {
        return (Flux<UnidadeOrganizacional>)
                webClientService.gerarRequisicaoGetFlux(UnidadeOrganizacional.class,
                        rotas.getUnidade(),
                        null,
                        null);
    }
}
