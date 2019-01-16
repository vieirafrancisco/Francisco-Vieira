package br.ufal.arapiraca.p2lp2.lista1.q4_q5_q7;

public class Endereco {
	private String rua;
	private String bairro;
	private int numeroCasa;
	
	public Endereco(String rua, String bairro, int numeroCasa) {
		this.rua = rua;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
}
