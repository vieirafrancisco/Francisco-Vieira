package polimorfismo.q3;

import java.util.List;
import java.util.Vector;

public class Main{

    public static void main(String[] args){
        List<Operacao> op = new Vector<>();

        Operacao a = new Adicao();
        Operacao b = new Subtracao();
        Operacao m = new Multiplicacao();
        Operacao d = new Divisao();

        op.add(a);
        op.add(b);
        op.add(m);
        op.add(d);

        List<Float> list = new Vector<>();
        list.add(10f);
        list.add(20f);
        list.add(30f);

        for(Operacao o: op){
            o.calcular(list);
            System.out.printf("%f\n", o.getResult());
        }

    }
}