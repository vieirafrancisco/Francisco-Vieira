package encapsulamento.q3;

public class Conta {
	private String numero;
	private double saldo;
	
	private boolean validarSaque(double valor) {
		if(valor <= this.saldo) {
			return true;
		}
		return false;
	}
	
	private boolean validarConta(String numero) {
		return true;
	}
	
	public void deposito(String numero, double valor) {
		if(validarConta(numero)) {
			setSaldo(this.saldo+valor);
		} else {
			// throw a exception
		}
	}
	
	public void saque(String numero, double valor) {
		if(validarConta(numero)) {
			if(validarSaque(valor)) {
				setSaldo(this.saldo-valor);
			} else {
				// throw a exception
			}
		} else {
			// throw a exception
		}
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
