package br.ufal.arapiraca.p2lp2.lista1.q2;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return this.lado*this.lado;
	}
	
	public double perimetro() {
		return this.lado*4;
	}
	
	public double getLado() {
		return this.lado;
	}
}
