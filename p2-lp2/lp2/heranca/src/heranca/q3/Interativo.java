package heranca.q3;

public class Interativo implements Fatorial {
	
	public int calcular(int n) {
		int fat = 1;
		
		for(int i = 1; i <= n; i++) {
			fat *= i;
		}
		
		return fat;
	}
	
}
