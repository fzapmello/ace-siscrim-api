package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class AreaExame {
    private long codigoAreaExame;
    private String nome;
    private String abreviacao;
    private boolean excluido;
    private String textoDocumentoTitulo;
    private String textoDocumentoSubtitulo;

}
