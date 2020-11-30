package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class MaterialTipo {

    private long codigoTipoMaterial;
    private String nome;
    private long codigoUnidadeMedidaPadrao;
    private String unidadeMedidaPadrao;
    private boolean excluido;
}
