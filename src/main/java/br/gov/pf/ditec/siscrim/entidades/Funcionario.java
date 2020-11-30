package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;
@Data
public class Funcionario {
    private long codigoFuncionario;
    private String nome;
    private String nomeGuerra;
    private String sexo;
    private long codigoCargo;
    private String siglaCargo;
    private String classe;
    private String matricula;
    private String contaUsuario;
    private String telefoneTrabalho;
    private String emailInstitucional;
    private long codigoSituacaoFuncionario;
    private String situacaoFuncionario;
    private String foto64;
    private long foto;
    private long codigoUnidadeLotacao;
    private long codigoUnidadeLocalizacao;
    private String siglaUnidadeLotacao;
    private String siglaUnidadeLocalizacao;
    private long codigoOrgaoExterno;
    private String observacao;
    private long codigoFuncionarioFormacao;
    private String funcionarioFormacao;
    private String ramalTrabalho;
    private ZonedDateTime dataHoraUltimoLogin;

}
