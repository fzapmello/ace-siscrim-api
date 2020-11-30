package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class DocumentoTipo {
    private long codigoTipoDocumento;
    private long codigoCategoriaDocumento;
    private String sigla;
    private String nome;
    private String diretorio;
    private boolean excluido;
    private String genero;
}
