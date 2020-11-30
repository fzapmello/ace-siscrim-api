package br.gov.pf.ditec.siscrim.rotas;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Seta as rotas para a API GO
 */
@Component
public class RotasConfig {


    @Bean
    public SujeitoRotas rotasSujeito() {
        return new SujeitoRotas();
    }
    @Bean
    public DocumentoRotas rotasDocumento() {
        return new DocumentoRotas();
    }
    @Bean
    public UnidadeRotas rotasUnidade() {
        return new UnidadeRotas();
    }

    @Bean
    public FuncionarioRotas rotasFuncionario() {
        return new FuncionarioRotas();
    }

    @Bean
    public MaterialRotas rotasMaterial() {
        return new MaterialRotas();
    }

    @Bean
    public ObjetoExameRotas rotasObjetoExame() {
        return new ObjetoExameRotas();
    }

    @Bean
    public ObjetoExameTipoRotas rotasObjetoExameTipoRotas() {
        return new ObjetoExameTipoRotas();
    }

    @Bean
    public ObjetoExameUnidadeMedidaRotas rotasObjetoExameUnidadeMedidaRotas() {
        return new ObjetoExameUnidadeMedidaRotas();
    }
}
