package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class ObjetoExameTipo {
    private long codigoTipoObjetoExame;
    private String nome;
    private String descricao;
    private long codigoTipoMaterial;
    private boolean excluido;
}
