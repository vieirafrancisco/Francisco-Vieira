package polimorfismo.q4;

public class Carne implements AlimentacaoIF {

    @Override
    public void comer(){
        System.out.println("Comendo carne!");
    }

}