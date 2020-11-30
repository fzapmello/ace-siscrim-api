package br.gov.pf.ditec.siscrim.entidades;

import lombok.Data;

@Data
public class QuantitativoCarimboTempo {
    private int requisicaoCarimboTempo;
    private int respostaCarimboTempo;
    private int falhaValidacaoCarimboTempo;
}
