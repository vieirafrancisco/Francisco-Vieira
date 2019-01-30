package polimorfismo.q5;

public abstract class Empregado {
	private String nome;
	private String cpf;
	private String rg;
	
	public Empregado(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public abstract double calcularGanho();
	
}
