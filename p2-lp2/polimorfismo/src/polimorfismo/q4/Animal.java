package polimorfismo.q4;

public abstract class Animal {
	
	private String descricao;
	private String nome;
	private LocomocaoIF locomocao;
	private AlimentacaoIF alimentacao;
	
	public Animal(String descricao, String nome) {
		this.descricao = descricao;
		this.nome = nome;
	}

	@Override
	public String toString(){
		return String.format("%s é um animal", this.nome);
	}

	public void locomover(){
		this.locomocao.mover();
	}

	public void alimentar(){
		this.alimentacao.comer();
	}

	public void setLocomocao(LocomocaoIF locomocao){
		this.locomocao = locomocao;
	}

	public void setAlimentacao(AlimentacaoIF alimentacao){
		this.alimentacao = alimentacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
