package heranca.q4;

import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<Imovel> imoveis = new Vector<>();
		
		Imovel i1 = new Imovel("fdsfjs", 800);
		Imovel i2 = new Novo("fkdfsd", 800, 50);

		try {
			Imovel i3 = new Velho("fhsdfjk", 800, 50);
			imoveis.add(i3);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		imoveis.add(i1);
		imoveis.add(i2);
		
		for(Imovel i: imoveis) {
			System.out.println(i.getPreco());
		}
		
		
		
		
	}
}
