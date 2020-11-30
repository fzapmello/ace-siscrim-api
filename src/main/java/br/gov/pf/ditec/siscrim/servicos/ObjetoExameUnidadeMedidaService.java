package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.ObjetoExameUnidadeMedidaRotas;
import br.gov.pf.ditec.siscrim.entidades.ObjetoExameUnidadeMedida;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
@Service
public class ObjetoExameUnidadeMedidaService extends AbstractService{

    @Autowired
    public ObjetoExameUnidadeMedidaRotas rotas;

    public Flux<ObjetoExameUnidadeMedida> listarUnidadeMedida(Contexto contexto, String query) {
        return (Flux<ObjetoExameUnidadeMedida>)
                webClientService.gerarRequisicaoGetFlux(ObjetoExameUnidadeMedida.class,
                        rotas.getObjetoExameUnidadeMedida(),
                        contexto,
                        query);
    }
}
