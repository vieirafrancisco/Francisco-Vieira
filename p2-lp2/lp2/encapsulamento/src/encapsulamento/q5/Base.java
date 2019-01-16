package encapsulamento.q5;

public class Base {
	protected int a;
	private int b;
	public int c;
	
	public int getB() {
		return this.b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	/*
	 * RESPOSTA: Não poderá compilar pois por conta da variavel b ser privada, quando
	 * na tentativa de calcular a = b + c, a classe Basinha não poderá acessar o b, e
	 * para resolver isso deve-se criar o get e o set de b. Para atender o encapsulamento
	 * por completo é bom colocar todos os atributos privados e criar seus respectivos
	 * getters e setters, neste caso.
	 * */
}