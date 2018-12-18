package br.ufal.arapiraca.p2lp2.lista1.q1;

public class Character {
	private int level = 0;
	
	public Character() {
		
	}
	
	public void printLevel() {
		System.out.println(this.level);
	}
	
	public void incrementLevel() {
		this.level += 1;
	}
	
	public void setToZeroLevel() {
		this.level = 0;
	}
	
}
