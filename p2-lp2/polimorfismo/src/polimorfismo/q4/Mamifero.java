package polimorfismo.q4;

public abstract class Mamifero extends Animal {

	public Mamifero(String descricao, String nome) {
		super(descricao, nome);
	}
	
	@Override
	public String toString() {
		return String.format("%s é um mamifero", getNome());
	}
	
}
