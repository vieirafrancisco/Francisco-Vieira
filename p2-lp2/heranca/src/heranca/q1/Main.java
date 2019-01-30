package heranca.q1;

public class Main {
	
	public static void main(String[] args) {
		Ingresso i1 = new Ingresso(100);
		Ingresso i2 = new IngressoVip(100, 10);
		
		System.out.println(i1);
		System.out.println(i1.getValor());
		System.out.println(i2);
		System.out.println(i2.getValor());
	}
	
}
