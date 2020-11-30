package br.gov.pf.ditec.siscrim.rotas;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Sets storage configuration for uploaded files
 */
@ConfigurationProperties("siscrim")
public class SiscrimConfig {

    private String url = "http://localhost:8080";
    public String getUrl() {
        return url;
    }
}
