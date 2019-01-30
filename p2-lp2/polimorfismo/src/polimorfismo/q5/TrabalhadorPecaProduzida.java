package polimorfismo.q5;

public class TrabalhadorPecaProduzida extends Empregado {
	
	private double remuneracao;
	private int qtdProduzida;
	
	public TrabalhadorPecaProduzida(String nome, String cpf, String rg) {
		super(nome, cpf, rg);
	}
	
	@Override
	public double calcularGanho() {
		return this.remuneracao*this.qtdProduzida;
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public int getQtdProduzida() {
		return qtdProduzida;
	}

	public void setQtdProduzida(int qtdProduzida) {
		this.qtdProduzida = qtdProduzida;
	}
	
}
