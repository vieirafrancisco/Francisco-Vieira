package polimorfismo.q4;

public class Vegetal implements AlimentacaoIF {

    @Override
    public void comer(){
        System.out.println("Comendo vegetal!");
    }

}