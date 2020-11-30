package br.gov.pf.ditec.siscrim.rotas;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Seta as rotas para a API de ObjetoExameUnidadeMedidaRotas
 */
@Data
@ConfigurationProperties(prefix = "siscrim.rotas.objeto-exame-unidade-medida")
public class ObjetoExameUnidadeMedidaRotas {
    private String objetoExameUnidadeMedida;
}
