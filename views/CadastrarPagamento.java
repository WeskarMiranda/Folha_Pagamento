package views;
import controller.PagamentoController;
import controller.FuncionarioController;
import models.Pagamento;
import models.Funcionario;
import utils.Console;
public class CadastrarPagamento {
    public void renderizar() {
        Pagamento pagamento = new Pagamento();
		PagamentoController pagamentoController = new PagamentoController();
        FuncionarioController funcionarioController = new FuncionarioController();
		System.out.println("\n  CADASTRO DE PAGAMENTO  \n");
        String cpfFuncionario = Console.readString("Digite o CPF do funcionario: ");
        pagamento.setHora(Console.readDouble("Digite o horario: "));
        pagamento.setAno(Console.readInt("Digite o ano: "));
        pagamento.setMes(Console.readInt("Digite o mês: "));
        pagamentoController.cadastrar(pagamento);
        Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
        if (funcionario != null) {
            pagamento.setFuncionario(funcionario);
        } else {
            System.out.println("Funcionário não encontrado!");
        }
        System.out.println("\nPagamento cadastrado !!! ");
		
		
	}
}
