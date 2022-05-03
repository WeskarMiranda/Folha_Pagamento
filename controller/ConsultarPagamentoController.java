package controller;
import java.util.ArrayList;

import models.ConsultarPagamento;
public class ConsultarPagamentoController {
    private static ArrayList<ConsultarPagamento> consultarPagamentos = new ArrayList<ConsultarPagamento>();
	
	public  void cadastrar(ConsultarPagamento consultarPagamento){
        consultarPagamentos.add(consultarPagamento);
    }

	public static ArrayList<ConsultarPagamento> Listar(){
		return consultarPagamentos;
	}
    
    
}
