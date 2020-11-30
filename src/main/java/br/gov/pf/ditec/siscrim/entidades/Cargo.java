package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class Cargo {
    private long codigoCargo;
    private String nome;
    private String sigla;
    private String tratamento;
    private boolean excluido;
}
