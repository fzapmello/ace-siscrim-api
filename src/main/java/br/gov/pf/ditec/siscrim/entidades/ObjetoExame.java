package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ObjetoExame {

    private long codigoObjetoExame;
    private long codigoSolicitacaoExame;
    private long codigoMaterial;
    private long codigoTipoObjetoExame;
//    private ObjetoExameTipo tipoObjetoExame;
    private double medida;
    private long codigoUnidadeMedida;
    private double medidaAdicional;
    private long codigoUnidadeMedidaAdicional;
    private String descricao;
    private long codigoUsuarioCriacao;
    private ZonedDateTime dataHoraCriacao;
    private boolean excluido;
    private long codigoUnidadeLotacao;

}
