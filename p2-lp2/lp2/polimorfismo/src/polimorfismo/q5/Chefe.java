package polimorfismo.q5;

public class Chefe extends Empregado {
	
	private double salarioMensal;
	
	public Chefe(String nome, String cpf, String rg, double salarioMensal) {
		super(nome, cpf, rg);
		this.salarioMensal = salarioMensal;
	}
	
	@Override
	public double calcularGanho() {
		return this.salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
}
