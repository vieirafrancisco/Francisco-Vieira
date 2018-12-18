package br.ufal.arapiraca.p2lp2.lista1.q4_q5_q7;

import java.util.List;
import java.util.Vector;

public class Empresa {

		private String nome;
		private String cnpj;
		private List<Departamento> departamentos;
		
		public Empresa(String nome, String cnpj) {
			this.nome = nome;
			this.cnpj = cnpj;
			departamentos = new Vector<>();
		}
		
		public void adicionarDepartameto(Departamento departamento) throws LimiteDepartamentosException{
			if(limiteDepartamentos()) {
				departamentos.add(departamento);
			} else {
				throw new LimiteDepartamentosException("Limite de departamentos atingido.");
			}
		}
		
		/** Verify if the employee have a office and if the office is in the enterprise **/
		public void adicionarFuncionarioAoDepartamento(Empregado funcionario, Departamento departamento) {
			if(departamentoExist(departamento)) { 
				departamento.registrarFuncionario(funcionario);
			} else {
				// Exception
			}
		}
		
		
		/** Verify if the employee have a office and if the office is in the enterprise, and verify if the next office is in the enterprise **/
		public void transferirFuncionarioDeDepartamento(Empregado funcionario, Departamento dpAtual, Departamento dpProximo) {
			if(departamentoExist(dpAtual) && departamentoExist(dpProximo)) {
				dpAtual.removerFuncionario(funcionario);
				dpProximo.registrarFuncionario(funcionario);
			} else {
				// Exception
			}
		}
		
		private boolean departamentoExist(Departamento departamento) {
			return true;
		}
		
		private boolean limiteDepartamentos() {
			if(departamentos.size() <= 10) {
				return true;
			}
			return false;
		}
		
		public static void main(String args[]) {
			Empresa emp = new Empresa("Empresa1", "cnpj1");
			Departamento d1 = new Departamento();
			Departamento d2 = new Departamento();
			Empregado f1 = new Motorista("Jorge");
			Empregado f2 = new Motorista("Maria");
			
			try {
				emp.adicionarDepartameto(d1);
				emp.adicionarDepartameto(d2);
				
			} catch(LimiteDepartamentosException e) {
				System.out.println(e);
			}
			
			emp.adicionarFuncionarioAoDepartamento(f1, d1);
			emp.adicionarFuncionarioAoDepartamento(f2, d2);
			d1.apresentarFuncionarios();
			emp.transferirFuncionarioDeDepartamento(f1, d1, d2);
			d1.apresentarFuncionarios();
			d2.apresentarFuncionarios();
		}
		
}
