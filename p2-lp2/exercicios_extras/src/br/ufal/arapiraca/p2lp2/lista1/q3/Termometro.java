package br.ufal.arapiraca.p2lp2.lista1.q3;

public class Termometro {
	private double temperatura;
	
	public Termometro() {
		this.temperatura = 15;
	}
	
	public Termometro(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public void aumentarTemperatura() throws NoVerifyException {
		if(verifica(this.temperatura+5)) {
			this.temperatura+=5;
		} else {
			throw new NoVerifyException("Temperatura passou do limite, não pode aumentar!");
		}
		
	}
	
	public void dimiuirTemperatura() throws NoVerifyException {
		if(verifica(this.temperatura-5)) {
			this.temperatura-=5;
		} else {
			throw new NoVerifyException("Temperatura passou do limite, não pode diiminuir!");
		}
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public void setTemperatura(double temperatura) throws NoVerifyException {
		if(verifica(temperatura)) {
			this.temperatura = temperatura;
		} else {
			throw new NoVerifyException("Essa temperatura não pode ser inserida"); 
		}
	}
	
	private boolean verifica(double t) {
		if(t>-20 && t<100) {
			return true;
		} 
		return false;
	}
}
