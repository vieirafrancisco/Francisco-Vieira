package heranca.q1;

public class IngressoVip extends Ingresso {
	
	private float valorAdicional;
	
	public IngressoVip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public String toString() {
		return String.format("%f", getValor());
	}
	
	public float getValor() {
		return this.valor+this.valorAdicional;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
}
