package polimorfismo.q4;

public class Aguia extends Ave {
	
	public Aguia(String descricao, String nome) {
		super(descricao, nome);
	}
	
	public Aguia(String nome) {
		super(nome);
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando sob as nuvens");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo peixe");
	}
}
