package br.gov.pf.ditec.siscrim.servicos;

import br.gov.pf.ditec.siscrim.rotas.FuncionarioRotas;
import br.gov.pf.ditec.siscrim.entidades.Agenda;
import br.gov.pf.ditec.siscrim.entidades.Funcionario;
import br.gov.pf.ditec.siscrim.entidades.Material;
import br.gov.pf.ditec.siscrim.infra.http.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
public class FuncionarioService extends AbstractService {

    @Autowired
    public FuncionarioRotas rotas;

    public Mono<Funcionario> obterFuncionario(Contexto contexto, long codigoFuncionario) {
        return (Mono<Funcionario>)
                webClientService.gerarRequisicaoPostMono(Material.class,
                        rotas.getLacrarMaterialPorCodigo(),
                        contexto,
                        codigoFuncionario);
    }

   
    public Flux<Funcionario> listarFuncionarios(Contexto contexto, String query) {
        return (Flux<Funcionario>)
                webClientService.gerarRequisicaoGetFlux(Funcionario.class,
                        rotas.getListarFuncionarios(),
                        contexto,
                        query);
    }

   
    public Mono<Funcionario> obterFuncionarioLogado(Contexto contexto) {
        return (Mono<Funcionario>)
                webClientService.gerarRequisicaoGetMono(Funcionario.class,
                        rotas.getObterFuncionarioLogado(),
                        contexto,
                        null);
    }



   
    public Flux<Funcionario> obterRegistrosAgendaFuncionario(Contexto contexto, long codigoFuncionario, Date dataInicio, Date dataTermino) {
        return (Flux<Funcionario>)
                webClientService.gerarRequisicaoPostFlux(Funcionario.class,
                        rotas.getObterRegistrosAgendaFuncionario(),
                        contexto,
                        codigoFuncionario,
                        dataInicio,
                        dataTermino);
    }

   
    public Mono<Funcionario> cadastrarRegistroAgendaFuncionario(Contexto contexto, Agenda agenda) {
        return (Mono<Funcionario>)
                webClientService.gerarRequisicaoPostMono(Funcionario.class,
                        rotas.getCadastrarRegistroAgendaFuncionario(),
                        contexto,
                        agenda);
    }

   
    public Mono<Funcionario> alterarRegistroAgendaFuncionario(Contexto contexto, Agenda agenda) {
        return (Mono<Funcionario>)
                webClientService.gerarRequisicaoPostMono(Funcionario.class,
                        rotas.getAlterarRegistroAgendaFuncionario(),
                        contexto,
                        agenda);
    }

}
