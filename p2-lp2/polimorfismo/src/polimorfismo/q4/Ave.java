package polimorfismo.q4;

public abstract class Ave extends Animal {
	
	public Ave(String descricao, String nome) {
		super(descricao, nome);
	}
	
	@Override
	public String toString(){
		return String.format("%s é uma ave", getNome());
	}
}
