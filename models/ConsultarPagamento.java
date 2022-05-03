package models;

public class ConsultarPagamento {
    private Funcionario funcionario;
    private Pagamento pagamento;

    
   
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
    @Override
	public String toString() {
		return  "|CPF: "+funcionario.getCpf() + "|Mês: "+pagamento.getMes() + "|Ano: "+pagamento.getAno();
    }







    
}