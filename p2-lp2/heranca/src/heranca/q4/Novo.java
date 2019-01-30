package heranca.q4;

public class Novo extends Imovel {
	private float adicionalPreco;
	
	public Novo(String endereco, float preco, float adicionalPreco) {
		super(endereco, preco);
		this.adicionalPreco = adicionalPreco;
		setPreco(preco+adicionalPreco);
	}
	
	public float getAdicionalPreco() {
		return adicionalPreco;
	}

	public void setAdicionalPreco(float adicionalPreco) {
		this.adicionalPreco = adicionalPreco;
	}	
	
}
