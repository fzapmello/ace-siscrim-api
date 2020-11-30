package br.gov.pf.ditec.siscrim.infra.http;

import lombok.Data;

@Data
public class Contexto {
    private Parametros parametros;
    private DadosAutenticacao dadosAutenticacao;
    private String tokenJwt;
    private String userFingerPrint;

    public Contexto(Parametros parametros, String tokenJwt) {
        this.parametros = parametros;
        this.tokenJwt = tokenJwt;
    }
}
