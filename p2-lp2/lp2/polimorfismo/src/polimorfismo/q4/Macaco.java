package polimorfismo.q4;

public class Macaco extends Mamifero {
	
	public Macaco(String descricao, String nome) {
		super(descricao, nome);
	}
	
	public Macaco(String nome) {
		super(nome);
	}
	
	@Override
	public void locomover() {
		System.out.println("Locomovedo entre as árvores");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo banana");
	}
	
}
