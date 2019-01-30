package polimorfismo.q4;

public abstract class Ave extends Animal {
	
	public Ave(String descricao, String nome) {
		super(descricao, nome);
	}
	
	public Ave(String nome) {
		super(nome);
	}
	
	@Override
	public String getNome() {
		return String.format("%s é um(a) Ave", this.nome);
	}
}
