package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class FuncionarioFormacao {
    private long codigoFuncionarioFormacao;
    private String nome;
    private long codigoFuncionarioAreaTecnica;
    private boolean excluido;
}
