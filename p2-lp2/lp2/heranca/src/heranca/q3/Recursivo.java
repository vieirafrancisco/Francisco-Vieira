package heranca.q3;

public class Recursivo implements Fatorial {
	
	public int calcular(int n) {
		if(n == 0) return 1;
		
		return calcular(n-1)*n;
	}
	
}
