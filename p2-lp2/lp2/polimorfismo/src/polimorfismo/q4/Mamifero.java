package polimorfismo.q4;

public abstract class Mamifero extends Animal {

	public Mamifero(String descricao, String nome) {
		super(descricao, nome);
	}
	
	public Mamifero(String nome) {
		super(nome);
	}
	
	@Override
	public String getNome() {
		return String.format("%s é um(a) Mamifero", this.nome);
	}
	
}
