package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.ObjetoExameRotas;
import br.gov.pf.ditec.siscrim.entidades.ObjetoExame;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
@Service
public class ObjetoExameService extends AbstractService{

    @Autowired
    public ObjetoExameRotas rotas;


    public Mono<ObjetoExame> obterObjetoExame(Contexto contexto, long codigoObjetoExame) {
        return (Mono<ObjetoExame>)
                webClientService.gerarRequisicaoGetMono(ObjetoExame.class,
                        rotas.getObjetoExame(),
                        contexto,
                        codigoObjetoExame);
    }


    public Mono<ObjetoExame> excluirObjetoExame(Contexto contexto, long codigoObjetoExame) {
        return (Mono<ObjetoExame>)
                webClientService.gerarRequisicaoDelete(ObjetoExame.class,
                        rotas.getObjetoExame(),
                        contexto,
                        codigoObjetoExame);
    }


    public Mono<ObjetoExame> alterarObjetoExame(Contexto contexto, ObjetoExame ObjetoExame) {
        return (Mono<ObjetoExame>)
                webClientService.gerarRequisicaoPut(ObjetoExame.class,
                        rotas.getObjetoExame(),
                        contexto,
                        ObjetoExame);
    }
}
