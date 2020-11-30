package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Documento {
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
    private String nomeCurtoSujeitoPosse;
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
