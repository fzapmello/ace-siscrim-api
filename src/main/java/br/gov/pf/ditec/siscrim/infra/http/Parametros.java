package br.gov.pf.ditec.siscrim.infra.http;

import lombok.Data;

@Data
public class Parametros {
    private long codigo;
    private int limit;
    private int offset;
    private String termo;
    private String comentario;
    private String nome;
    private String inicio;
    private String termino;
}
