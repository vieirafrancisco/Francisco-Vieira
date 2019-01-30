package heranca.q2;

public class Vendedor extends Empregado {

	private float percentualComissao;
	
	public Vendedor(String nome, float salario, float percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s SalarioSemComissao: %f SalarioComComissao: %f"
				+ " percentualComissao: %f", getNome(), this.salario, calcularSalario(),
				this.percentualComissao);
	}
	
	public float calcularSalario() {
		return this.salario + (this.salario*this.percentualComissao);
	}

	public float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

}
