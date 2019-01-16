package polimorfismo.q4;

public class Passaro extends Ave {
	
	public Passaro(String descricao, String nome) {
		super(descricao, nome);
	}
	
	public Passaro(String nome) {
		super(nome);
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando sob as árvores");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo sementes");
	}
}
