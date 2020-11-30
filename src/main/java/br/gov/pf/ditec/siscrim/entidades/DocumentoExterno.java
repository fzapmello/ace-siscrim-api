package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class DocumentoExterno {
    private long codigoDocumentoExterno;
    private long codigoTipoDocumento;
    private String numeroDocumento;
    private int anoDocumento;
    private String siglaOrgaoEmissor;
    private long codigoOrgaoEmissor;
    private String nomeSignatario;
    private String sexoSignatario;
    private String funcaoSignatario;
    private int numeroProtocolo;
    private int anoProtocolo;
    private long codigoUnidadeProtocolo;
    private ZonedDateTime dataProtocolo;
    private long codigoFinalidadeDocumento;
    private int urgencia;
    private String motivoUrgencia;
    private ZonedDateTime dataLimite;
    private long codigoAreaExame;
    private int numeroCopia;
    private long codigoTituloExame;
    private long codigoSubtituloExame;
    private long codigoSituacaoDocumento;
    private long codigoComplexidade;
    private String nomeSolicitante;
    private String sexoSolicitante;
    private String funcaoSolicitante;
    private long codigoSubtipoDocumento;
    private long codigoDocumento;
    private ZonedDateTime dataEmissao;
    private String numeroSiapro;
    private long codigoProcedimento;
    private String operacao;
    private String assunto;
    private boolean sigiloso;
    private String observacao;
    private boolean externo;
    private boolean excluido;
    private long codigoMunicipioOcorrencia;
    private String localizacaoOcorrencia;
    private double latitudeExame;
    private double longitudeExame;
    private String datumExame;
    private long codigoObjeto;
    private long codigoUnidadeRegistro;
    private long codigoTipoObjeto;
    private long codigoObjetoPai;
    private long codigoObjetoAncestral;
    private long codigoSujeitoPosse;
    private String identificacao;
    private String resumo;
    private String conteudo;
    private boolean recebido;
    private ZonedDateTime dataArquivamento;
    private String usuarioCriacao;
    private ZonedDateTime dataHoraCriacao;
    private String usuarioExclusao;
    private ZonedDateTime dataHoraExclusao;
    private String motivoExclusao;
    private String usuarioModificacao;
    private ZonedDateTime dataHoraModificacao;
    private long codigoUltimaMovimentacao;
    private long codigoMovimentacaoDesignacao;
    private long codigoGrupoResponsavel;
    private long codigoUnidadePosse;
    private long idDocumentoSei;
    private String numeroDocumentoSei;
    private long idProcessoSei;
}