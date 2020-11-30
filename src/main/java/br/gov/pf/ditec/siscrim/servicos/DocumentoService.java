package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.DocumentoRotas;
import br.gov.pf.ditec.siscrim.entidades.Documento;
import br.gov.pf.ditec.siscrim.entidades.UnidadeOrganizacional;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DocumentoService extends AbstractService{

    @Autowired
    public DocumentoRotas rotas;

    public Mono<Documento> obterDocumento(Contexto contexto, long codigoDocumento) {
        return (Mono<Documento>)
                webClientService.gerarRequisicaoGetMono(UnidadeOrganizacional.class,
                        rotas.getDocumento(),
                        contexto,
                        codigoDocumento);
    }
}
