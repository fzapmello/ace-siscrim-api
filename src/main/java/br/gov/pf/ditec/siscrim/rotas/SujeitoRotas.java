package br.gov.pf.ditec.siscrim.rotas;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Seta as rotas para a API de Sujeito
 */
@Data
@ConfigurationProperties(prefix = "siscrim.rotas.sujeito")
public class SujeitoRotas {
    private String sujeito;
    private String obterMateriaisNaCargaDoSujeito;
    private String obterDocumentosNaCargaDoSujeito;

}
