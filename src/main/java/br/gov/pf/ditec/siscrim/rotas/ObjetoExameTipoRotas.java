package br.gov.pf.ditec.siscrim.rotas;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Seta as rotas para a API de ObjetoExameTipoRotas
 */
@Data
@ConfigurationProperties(prefix = "siscrim.rotas.objeto-exame-tipo")
public class ObjetoExameTipoRotas {
    private String objetoExameTipo;
}
