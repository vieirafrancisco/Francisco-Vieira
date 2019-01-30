package polimorfismo.q4;

import java.util.List;
import java.util.Vector;

public abstract class Animal {
	
	private String descricao;
	protected String nome;
	
	public Animal(String descricao, String nome) {
		this.descricao = descricao;
		this.nome = nome;
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void locomover() {}
	
	public void alimentar() {}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return String.format("%s é um(a) Animal", this.nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void main(String[] args) {
		
		List<Animal> animais = new Vector<>();
		
		Animal c = new Cachorro("Budog Francês","Doguinho");
		Animal p = new Passaro("Normal", "Francis");
		Animal a = new Aguia("Normal", "AGUIAR");
		Animal m = new Macaco("Normal", "Monkey");
		
		animais.add(a);
		animais.add(c);
		animais.add(p);
		animais.add(m);
		
		for(Animal animal: animais) {
			System.out.println(animal.getNome());
			animal.locomover();
			animal.alimentar();
			System.out.println();
		}
	}
	
}
