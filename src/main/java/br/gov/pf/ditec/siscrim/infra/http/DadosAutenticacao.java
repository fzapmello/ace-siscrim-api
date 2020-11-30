package br.gov.pf.ditec.siscrim.infra.http;

import lombok.Data;

@Data
public class DadosAutenticacao {
    private String username;
    private boolean autenticado;
    private String erroAutenticacao;
}
