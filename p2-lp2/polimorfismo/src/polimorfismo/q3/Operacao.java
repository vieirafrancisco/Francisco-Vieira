package polimorfismo.q3;

import java.util.List;

public abstract class Operacao {

	private float result;
	
	public abstract float calcular(float num1, float num2);
	
	public void calcular(List<Float> numeros){
		this.result = numeros.get(0);
		
		for(int i = 1; i < numeros.size(); i++){
			result = calcular(result, numeros.get(i));
		}
	}

	public float getResult(){
		return this.result;
	}

}
