package br.gov.pf.ditec.siscrim.rotas;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Seta as rotas para a API de Funcionário
 */
@Data
@ConfigurationProperties(prefix = "siscrim.rotas.funcionario")
public class FuncionarioRotas {
    private String funcionario;
    private String listarFuncionarios;
    private String obterFuncionario;
    private String obterFuncionarioLogado;
    private String lacrarMaterialPorCodigo;
    private String obterRegistrosAgendaFuncionario;
    private String cadastrarRegistroAgendaFuncionario;
    private String alterarRegistroAgendaFuncionario;
}
