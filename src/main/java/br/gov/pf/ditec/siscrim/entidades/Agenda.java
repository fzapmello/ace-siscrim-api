package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class Agenda {

    long CodigoFuncionario;
    String Nome;
    String Sexo;
    String SiglaCargo;
    String Matricula;
    String TelefoneTrabalho;
    long CodigoSituacaoFuncionario;
    String Foto64;
    long Foto;
    long CodigoUnidadeLocalizacao;
    String SiglaUnidadeLocalizacao;
    long CodigoOrgaoExterno;
    long CodigoFuncionarioFormacao;
    String RamalTrabalho;
}
