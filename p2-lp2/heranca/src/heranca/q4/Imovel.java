package heranca.q4;

public class Imovel {
	private String endereco;
	private float preco;
	
	public Imovel(String endereco, float preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if(preco >= 0) {
			this.preco = preco;
		} else {
			//raise a exception
		}
	}
	
}
