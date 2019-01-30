package heranca.q2;

public class Gerente extends Empregado {
	private String departamento;
	
	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s Salario: %f Departamento: %s",
				this.getNome(), this.salario, this.departamento);
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
