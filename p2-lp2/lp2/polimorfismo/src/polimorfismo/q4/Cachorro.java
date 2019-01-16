package polimorfismo.q4;

public class Cachorro extends Mamifero {
	
	public Cachorro(String descricao, String nome) {
		super(descricao, nome);
	}
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void locomover() {
		System.out.println("Andando com suas quatro patas");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo ração");
	}
}
