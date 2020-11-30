package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Material {
    private long codigoMaterial;
    private long codigoTipoMaterial;
    private String materialTipo;
    private int numeroRegistro;
    private int anoRegistro;
    private long codigoUnidadeRegistro;
    private String descricao;
    private long codigoUnidadeMedida;
    private String lacre;
    private long codigoLocalArmazenamento;
    private String observacao;
    private String usuarioCriacao;
    private ZonedDateTime dataHoraCriacao;
    private String usuarioModificacao;
    private ZonedDateTime dataHoraModificacao;
    private int numeroItens;
    private double medida;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private String partNumber;
    private String operacao;
    private String mandadoBusca;
    private String localBusca;
    private String equipeBusca;
    private String autoApreensao;
    private String itemApreensao;
    private String identificacao;
    private String resumo;
    private String conteudo;
    private boolean excluido;
    private String usuarioExclusao;
    private String motivoExclusao;
    private ZonedDateTime dataHoraExclusao;
    private long codigoObjetoPai;
    private long codigoObjetoAncestral;
    private long codigoSujeitoPosse;
    private Sujeito sujeitoPosse;
    private boolean recebido;
    private ZonedDateTime dataArquivamento;
    private long codigoObjeto;
    private long codigoTipoObjeto;
    private long codigoFinalidadeMaterial;
    private MaterialFinalidade materialFinalidade;
    private long codigoUnidadePosse;
    private long codigoUltimaMovimentacao;
    private long codigoMovimentacaoDesignacao;
    private long codigoGrupoResponsavel;
    private long codigoMaterialPai;
}
