package polimorfismo.q4;

public class Voar implements LocomocaoIF {

    @Override
    public void mover(){
        System.out.println("Voando!");
    }

}