package br.ufal.arapiraca.p2lp2.lista1.q4_q5_q7;

public class Main {
	public static void main(String[] args) {
		
		Empregado emp;
		
		try {
			emp = new Empregado("Maria", 500);
			System.out.println(emp.getSalarioMensal());
		} catch(NegativeSalaryException e) {
			System.out.println(e);
		}
		
		
	}
}
