package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

import java.time.ZonedDateTime;
@Data
public class Feriado {
    private long codigoFeriado;
    private ZonedDateTime dataFeriado;
    private String nome;
    private boolean movel;
    private boolean nacional;
    private long codigoUnidadeRegistro;
}
