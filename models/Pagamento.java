package models;

public class Pagamento {
    private Funcionario funcionario;
    private int mes;
    private int ano;
    private double hora;


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getHora() {
        return hora;
    }


    public void setHora(double hora) {
        this.hora = hora;
    }
    @Override
	public String toString() {
		return  "|CPF: "+ funcionario.getCpf()+ "| Mês: "+ getMes() + "|Ano: " + getAno() + "|Hora: " + getHora();
    }
}



