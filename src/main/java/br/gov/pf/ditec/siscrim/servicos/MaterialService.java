package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.MaterialRotas;
import br.gov.pf.ditec.siscrim.entidades.Material;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MaterialService extends AbstractService {

    @Autowired
    public MaterialRotas rotas;

    public Material obterMaterial(Contexto contexto, long codigoMaterial) {
        return (Material) webClientService.gerarRequisicaoGetMono(Material.class,
                        rotas.getMaterial(),
                        contexto,
                        codigoMaterial);
    }

    public Material excluirMaterial(Contexto contexto, long codigoMaterial, String motivoExclusao) {
        return (Material) webClientService.gerarRequisicaoDelete(Material.class,
                        rotas.getMaterial(),
                        contexto,
                        codigoMaterial, motivoExclusao);
    }

   
    public Material alterarMaterial(Contexto contexto, Material material) {
        return (Material) webClientService.gerarRequisicaoPut(Material.class,
                        rotas.getAlterarMaterial(),
                        contexto,
                        material);
    }

   
    public Material alterarDescricaoMaterial(Contexto contexto, Material material) {
        return (Material) webClientService.gerarRequisicaoPut(Material.class,
                        rotas.getMaterial(),
                        contexto,
                        material);
    }

   
    public Material obterLacreAtualMaterial(Contexto contexto, long codigoMaterial) {
        return (Material) webClientService.gerarRequisicaoGetMono(Material.class,
                        rotas.getObterLacreAtualMaterial(),
                        contexto,
                        codigoMaterial);
    }

   
    public Material deslacrarMaterialPorCodigo(Contexto contexto, long codigoMaterial, String comentario) {
        return (Material) webClientService.gerarRequisicaoPut(Material.class,
                        rotas.getDeslacrarMaterialPorCodigo(),
                        contexto,
                        codigoMaterial,
                        comentario);
    }

   
    public Material lacrarMaterialPorCodigo(Contexto contexto, long codigoMaterial, String lacre, String comentario) {
        return (Material) webClientService.gerarRequisicaoPostMono(Material.class,
                        rotas.getLacrarMaterialPorCodigo(),
                        contexto,
                        codigoMaterial,
                        lacre,
                        comentario);
    }
}
