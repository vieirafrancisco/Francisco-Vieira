package polimorfismo.q4;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String [] args){
        
        LocomocaoIF voar = new Voar();
        LocomocaoIF andar = new Andar();
        LocomocaoIF correr = new Correr();
        AlimentacaoIF carne = new Carne();
        AlimentacaoIF vegetal = new Vegetal();

        List<Animal> animais = new Vector<>();

        Animal passaro = new Passaro("Passaro", "kfjksljf");
        Animal cachorro = new Cachorro("Cachorro", "jfshjf");
        Animal macaco = new Macaco("Macaco", "jskhf");
        Animal aguia = new Aguia("Aguia", "fshjkf");

        passaro.setLocomocao(voar);
        passaro.setAlimentacao(vegetal);
        cachorro.setLocomocao(correr);
        cachorro.setAlimentacao(carne);

        animais.add(passaro);
        animais.add(cachorro);

        for(Animal a: animais){
            System.out.println(a);
            a.locomover();
            a.alimentar();
        }


    }
}