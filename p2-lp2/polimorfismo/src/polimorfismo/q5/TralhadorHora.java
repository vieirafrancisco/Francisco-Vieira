package polimorfismo.q5;

public class TralhadorHora extends Empregado {

	private double slarioHora;
	private int qtdHoras;
	
	public TralhadorHora(String nome, String cpf, String rg,
			double salarioHora, int qtdHoras) {
		super(nome, cpf, rg);
		this.slarioHora = salarioHora;
		this.qtdHoras = qtdHoras;
	}
	
	public double getSlarioHora() {
		return slarioHora;
	}
	
	@Override
	public double calcularGanho() {
		return this.slarioHora*this.qtdHoras;
	}

	public void setSlarioHora(double slarioHora) {
		this.slarioHora = slarioHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
}
