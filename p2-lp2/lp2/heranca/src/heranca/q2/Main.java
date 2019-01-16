package heranca.q2;

import java.util.List;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args) {
		List<Empregado> empregados = new Vector<>();
		
		Empregado e1 = new Empregado("Jorge", 1000);
		Empregado e2 = new Gerente("Maria", 1500,"depx");
		Empregado e3 = new Vendedor("Neto", 1350, 0.2f);
		
		empregados.add(e1);
		empregados.add(e2);
		empregados.add(e3);
		
		for(Empregado e: empregados) {
			System.out.println(e);
		}
	}
	
}
