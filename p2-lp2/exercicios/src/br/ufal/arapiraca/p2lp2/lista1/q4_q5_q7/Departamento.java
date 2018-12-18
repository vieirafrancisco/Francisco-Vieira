package br.ufal.arapiraca.p2lp2.lista1.q4_q5_q7;

import java.util.List;
import java.util.Vector;

public class Departamento {
	private List<Empregado> funcionarios;
	
	public Departamento() {
		funcionarios = new Vector<>();
	}
	
	public void registrarFuncionario(Empregado funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Empregado funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public void apresentarFuncionarios() {
		for(Empregado f: this.funcionarios) {
			System.out.println("Funcionario: " + f.getNome() + ", Salário: " + f.getSalarioMensal());
		}
	}
		
	public static void main(String[] args) {
		Departamento d = new Departamento();
		Empregado f1,f2,f3,f4;
		f1 = new Recepcionista("Maria");
		f2 = new Porteiro("José");
		f3 = new Porteiro("Rosa");
		f4 = new Motorista("Linda");
		
		d.registrarFuncionario(f1);
		d.registrarFuncionario(f2);
		d.registrarFuncionario(f3);
		d.registrarFuncionario(f4);
		d.removerFuncionario(f3);
		
		d.apresentarFuncionarios();
		
	}
}
