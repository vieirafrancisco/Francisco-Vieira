package heranca.q1;

public class Ingresso {
	
	private float valor;
	
	public Ingresso(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return String.format("%f", this.valor);
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
}
