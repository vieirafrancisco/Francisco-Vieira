package polimorfismo.q5;

public class TrabalhadorComissionado extends Empregado {

	private double salario;
	private double comissao;
	private double qtdVendas;

	public TrabalhadorComissionado(String nome, String cpf, String rg,
			double salario, double comissao, double qtdVendas) {
		super(nome, cpf, rg);
		this.salario = salario;
		this.comissao = comissao;
		this.qtdVendas = qtdVendas;
	}

	@Override
	public double calcularGanho() {
		return this.salario + (this.comissao*this.qtdVendas);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(double qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
}
