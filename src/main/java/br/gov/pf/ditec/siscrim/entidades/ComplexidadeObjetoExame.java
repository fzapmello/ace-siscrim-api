package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ComplexidadeObjetoExame {
    private long codigoComplexidadeObjetoExame;
    private long codigoTipoObjetoExame;
    private double complexidadeFixa;
    private long codigoUnidadeMedida;
    private String descricaoUnidadeMedida;
    private long codigoUnidadeMedidaAdicional;
    private String descricaoUnidadeMedidaAdicional;
    private ZonedDateTime dataInicioVigencia;
    private ZonedDateTime dataTerminoVigencia;
}
