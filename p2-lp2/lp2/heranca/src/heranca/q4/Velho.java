package heranca.q4;

public class Velho extends Imovel {
	private float descontoPreco;
	
	public Velho(String endereco, float preco, float descontoPreco) throws Exception {
		super(endereco, preco);
		this.descontoPreco = descontoPreco;
		try {
			setPreco(preco-descontoPreco);
		} catch(Exception e){
			throw new Exception("Não pode ter preco negativo!");
		}
	}

	public float getDescontoPreco() {
		return descontoPreco;
	}

	public void setDescontoPreco(float descontoPreco) {
		this.descontoPreco = descontoPreco;
	}
	
}
