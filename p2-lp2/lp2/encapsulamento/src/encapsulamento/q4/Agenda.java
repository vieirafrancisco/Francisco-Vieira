package encapsulamento.q4;

import java.util.List;
import java.util.Vector;

public class Agenda {
	private List<Nota> notas;
	private String dono;
	
	public Agenda(String dono) {
		this.notas = new Vector<>();
		this.dono = dono;
	}
	
	private boolean estarNaLista(Nota nota) {
		for(Nota n: this.notas) {
			if(n == nota) return true;
		}
		
		return false;
	}
	
	public void adicionar(String dono, String texto) {
		if(this.dono == dono) {
			Nota nota = new Nota(dono, texto);
			this.notas.add(nota);
		} else {
			// raise exception
			System.out.println("O dono da agenda não é o mesmo dono da nota");
		}
	}
	
	public void remover(Nota nota) {
		if(estarNaLista(nota)) {
			this.notas.remove(nota);
		} else {
			// raise exception
			System.out.println("Não exite essa nota na lista de notas!");
		}
	}
	
	public void atualizar(Nota nota, String dono, String texto) {}
	
	public List<Nota> listarTrue(){
		Vector<Nota> tempNotas = new Vector<>(); 
		
		for(Nota nota: this.notas) {
			if(nota.isEstado()) {
				tempNotas.add(nota);
			}
		}
		
		return tempNotas;
	}
	
	public List<Nota> listarFalse(){
		Vector<Nota> tempNotas = new Vector<>();
		
		for(Nota nota: this.notas) {
			if(!nota.isEstado()) {
				tempNotas.add(nota);
			}
		}
		
		return tempNotas;
	}
	
	public void finalizar(Nota nota) {
		if(estarNaLista(nota)) {
			nota.setEstado(false);
		}
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public List<Nota> getNotas(){
		return this.notas;
	}
	
	public void printNotas() {
		if(this.notas.size() > 0) {
			for(Nota nota: this.notas) {
				System.out.printf("Dono: %s  Texto: %s\n", nota.getDono(), nota.getTexto());
			}
		} else {
			// raise exception
			System.out.println("Não existe nenhum elemento na lista!");
		}
	}
	
	public static void main(String[] args) {
		Agenda a = new Agenda("Maria");
		
		a.adicionar("Maria", "jfhsjfhd");
		a.adicionar("Jorge", "fhsdkfh");
		
		a.printNotas();
	}
	
}
