package br.ufal.arapiraca.p2lp2.lista1.q2;

import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		List<Quadrado> quadrados = new Vector<>();
		
		for(int i = 10; i <= 100; i+=10) {
			quadrados.add(new Quadrado(i));
		}
		
		for(Quadrado q: quadrados) {
			System.out.println("lado:"+q.getLado());
			System.out.println("área:" + q.area());
			System.out.println("perimetro:" + q.perimetro());
		}
	}
}
