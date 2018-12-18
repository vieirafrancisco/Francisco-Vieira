package br.ufal.arapiraca.p2lp2.lista1.q4_q5_q7;

public class Empregado extends Pessoa {
	
	protected double salarioMensal;
	private String cargo;
	private Endereco endereco;
	private static double salarioBase = 300;
	
	public Empregado(String nome, double salarioMensal, String cargo, Endereco endereco) throws NegativeSalaryException {
		super(nome);
		setSalarioMensal(salarioMensal);
		this.cargo = cargo;
		this.endereco = endereco;
	}
	
	public Empregado(String nome, double salarioMensal) throws NegativeSalaryException {
		super(nome);
		setSalarioMensal(salarioMensal);
	}
	
	public Empregado(String nome, double salarioMensal, String cargo) throws NegativeSalaryException {
		super(nome);
		setSalarioMensal(salarioMensal);
		this.cargo = cargo;
	}
	
	public Empregado(String nome) {
		super(nome);
	}

	public double getSalarioMensal() {
		return this.salarioMensal+Empregado.salarioBase;
	}

	public void setSalarioMensal(double salarioMensal) throws NegativeSalaryException {
		double totalSalario = salarioMensal+Empregado.salarioBase;
		if(verificarSalario(totalSalario)) {
			this.salarioMensal = totalSalario;
		} else {
			throw new NegativeSalaryException("Salario não pode ser negativo!");
		}
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double getSalarioBase() {
		return Empregado.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		Empregado.salarioBase = salarioBase;
	}
	
	private boolean verificarSalario(double salario) {
		if(salario >= 0) {
			return true;
		}
		return false;
	}
	
}
