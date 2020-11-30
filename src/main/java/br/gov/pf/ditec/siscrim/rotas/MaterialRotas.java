package br.gov.pf.ditec.siscrim.rotas;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Seta as rotas para a API de Material
 */
@Data
@ConfigurationProperties(prefix = "siscrim.rotas.material")
public class MaterialRotas {
    private String material = "/material/{codigo}";
    private String alterarMaterial = "/material/{params}/descricao";
    private String obterLacreAtualMaterial = "/material/{params}/lacre";
    private String deslacrarMaterialPorCodigo  = "/material/{params}/deslacrar";
    private String lacrarMaterialPorCodigo = "/material/{params}/lacarar-material";

}

