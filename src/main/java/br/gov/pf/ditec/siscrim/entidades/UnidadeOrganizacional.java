package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class UnidadeOrganizacional {
    private long codigoUnidadeOrganizacional;
    private String sigla;
    private String nome;
    private String emailInstitucional;
    private String endereco;
    private String bairro;
    private String cidade;
    private String siglaUf;
    private String cep;
    private String telefone;
    private String fax;
    private String textoDocumentoGenero;
    private String textoDocumentoSigla;
    private String textoDocumentoTipo;
    private String textoDocumentoDescricao;
    private String textoDocumentoCidade;
    private boolean criminalistica;
    private boolean emiteLaudo;
    private boolean excluido;
    private boolean emiteOrdemMissao;
    private float percentualGestao;
    private long codigoUnidadeSuperior;
    private long codigoUnidadeRegistro;
    private long codigoFuncionarioTitular;
    private String nomeTitular;
    private long codigoFuncionarioSubstituto;
    private String nomeSubstituto;
}
