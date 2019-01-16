package encapsulamento.q5;

public class Basinha extends Base {
	
	public int c=10;
	
	public void fazerMetodo() {
		setB(10);
		a = getB()+c;
	}
	
	public static void main(String[] args) {
		Basinha t = new Basinha();
		t.fazerMetodo();
		System.out.println(t.a);
	}
}
