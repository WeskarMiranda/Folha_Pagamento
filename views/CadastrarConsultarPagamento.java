package views;

import controller.PagamentoController;
import controller.ConsultarPagamentoController;
import controller.FuncionarioController;
import models.Funcionario;
import models.Pagamento;
import models.ConsultarPagamento;
import utils.Console;




public class CadastrarConsultarPagamento {

    public void renderizar() {
        ConsultarPagamento consultarPagamento = new ConsultarPagamento();
        ConsultarPagamentoController consultarPagamentoController = new ConsultarPagamentoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        PagamentoController pagamentoController = new PagamentoController();


        System.out.println("\n -- CADASTRO DE CONSULTA DE PAGAMENTO -- \n");

        // Funcionario cpf
        String cpfFuncionario = Console.readString("Digite o CPF do funcionario: ");
        Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
        if (funcionario != null) {
            consultarPagamento.setFuncionario(funcionario);
        
            // Pagamento mês
            Integer mesPagamento = Console.readInt("Digite o mês: ");
            Pagamento pagamento = pagamentoController.buscarPorMes(mesPagamento);
            if (pagamento != null) {
                consultarPagamento.setPagamento(pagamento);
                
                // Pagamento ano
                Integer anoPagamento = Console.readInt("Digite o ano: ");
                Pagamento pagamento2 = pagamentoController.buscarPorAno(anoPagamento);
                if (pagamento2 != null) {
                consultarPagamento.setPagamento(pagamento2);
                consultarPagamentoController.cadastrar(consultarPagamento);
                System.out.println("Pagamento verificado com sucesso!");
                } else {
                    System.out.println("Ano não encontrado!");
                }
            } else{
            System.out.println("Mês não encontrado!");
            }
        } else {
            System.out.println("Funcionario não encontrado!");
        }
    }
}
                    
                



