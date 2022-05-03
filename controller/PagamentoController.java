package controller;
import java.util.ArrayList;

import models.Pagamento;
public class PagamentoController {
    private static ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public  void cadastrar(Pagamento pagamento){
        pagamentos.add(pagamento);
    }

	public static ArrayList<Pagamento> Listar(){
		return pagamentos;
	}
    public Pagamento buscarPorMes(Integer mes){
        for (Pagamento pagamentoCadastrado : pagamentos) {
            if(pagamentoCadastrado.getMes() == mes){
                return pagamentoCadastrado;
            }
        }
        return null;
    }
    public Pagamento buscarPorAno(Integer ano){
        for (Pagamento pagamentoCadastrado : pagamentos) {
            if(pagamentoCadastrado.getAno() == ano){
                return pagamentoCadastrado;
            }
        }
        return null;
    }

}
