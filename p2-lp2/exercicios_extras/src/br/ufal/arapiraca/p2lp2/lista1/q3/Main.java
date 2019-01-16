package br.ufal.arapiraca.p2lp2.lista1.q3;

public class Main {
	public static void main(String[] args) {
		Termometro t = new Termometro();
		
		try {
			t.aumentarTemperatura();
			t.dimiuirTemperatura();
			t.setTemperatura(-25);
			
		} catch(NoVerifyException e) {
			System.out.println(e);
		}
		
		System.out.println(t.getTemperatura());
	}
}
