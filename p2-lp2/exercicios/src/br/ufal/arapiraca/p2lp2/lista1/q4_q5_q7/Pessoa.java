package br.ufal.arapiraca.p2lp2.lista1.q4_q5_q7;

public abstract class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
