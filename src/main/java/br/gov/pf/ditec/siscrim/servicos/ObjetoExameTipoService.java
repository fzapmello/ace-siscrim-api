package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.ObjetoExameTipoRotas;
import br.gov.pf.ditec.siscrim.entidades.ObjetoExame;
import br.gov.pf.ditec.siscrim.entidades.ObjetoExameTipo;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class ObjetoExameTipoService extends AbstractService {

    @Autowired
    public ObjetoExameTipoRotas rotas;

    public Mono<ObjetoExame> listarTiposObjetoExame(Contexto contexto, long codigoObjetoExameTipo) {
        return (Mono<ObjetoExame>)
                webClientService.gerarRequisicaoGetMono(ObjetoExame.class,
                        rotas.getObjetoExameTipo(),
                        contexto,
                        codigoObjetoExameTipo);
    }


    public Mono<ObjetoExameTipo> obterObjetoExameTipo(Contexto contexto, long codigoObjetoExameTipo) {
        return (Mono<ObjetoExameTipo>)
                webClientService.gerarRequisicaoGetMono(ObjetoExameTipo.class,
                        rotas.getObjetoExameTipo(),
                        contexto,
                        codigoObjetoExameTipo);
    }


}
