package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class Sujeito {
    private long codigoSujeito;
    private long codigoTipoSujeito;
    private SujeitoTipo tipoSujeito;
    private String nome;
    private String nomeCurto;
    private String siglaUf;
    private boolean excluido;
}
