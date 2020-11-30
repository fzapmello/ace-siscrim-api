package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class HistoricoLacre {
    private long codigoHistoricoLacre;
    private long codigoMaterial;
    private String lacre;
    private ZonedDateTime dataHoraCriacao;
    private long codigoFuncionarioCriacao;
    private String comentarioCriacao;
    private ZonedDateTime dataHoraRemocao;
    private long codigoFuncionarioRemocao;
    private String comentarioRemocao;
}
