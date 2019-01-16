package heranca.q3;

public class Main {

	public static void main(String[] args) {
		Fatorial r = new Recursivo();
		Fatorial i = new Interativo();
		
		System.out.println(r.calcular(7));
		System.out.println(i.calcular(7));
	}
	
}
