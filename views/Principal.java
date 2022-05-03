package views;

import utils.Console;
public class Principal {
	

	public static void main(String[] args) {
		int op;
		

		do {
			System.out.println("\n -- FOLHA DE PAGAMENTO -- \n");
		    System.out.println("1 - Cadastrar funcionario");
		    System.out.println("2 - Cadastrar pagamento");
		    System.out.println("3 - Consultar pagamento");
		    System.out.println("4 - Consultar todas as folhas de pagamento");
            System.out.println("0 - Sair\n");
            op = Console.readInt("Digite uma opção: ");

			switch (op) {
				case 1: 
                	CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                	cadastrarFuncionario.renderizar();  
            	break;
				case 2:
                	CadastrarPagamento cadastrarPagamento = new CadastrarPagamento();
                	cadastrarPagamento.renderizar();
            	break;
				case 3:
                	CadastrarConsultarPagamento cadastrarConsultarPagamento = new CadastrarConsultarPagamento();
                	cadastrarConsultarPagamento.renderizar();
            	break;
				case 4: 
            	break;
            	case 0: 
					System.out.println("Programa encerrado");
            	break;
				default:
					System.out.println("Opcão invalida...");
			}
		} while (op!=0);

    }
	
}
