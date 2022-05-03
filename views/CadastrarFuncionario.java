
   
package views;

import controller.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {



	public void renderizar() {
        Funcionario funcionario = new Funcionario();
		FuncionarioController funcionarioController = new FuncionarioController();
		System.out.println("\n  CADASTRO DE FUNCIONARIO  \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionario: "));
        funcionario.setCpf(Console.readString("Digite o numero do Cpf: "));
        funcionarioController.cadastrar(funcionario);
        System.out.println("\nFuncionario cadastrado !!! ");
		
		
		}
	}

