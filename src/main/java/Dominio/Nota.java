package Dominio;

public abstract class Nota {
	String nota;
	
	public String getNota() {
		return nota;
	}
	
	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public abstract boolean aprobada();
}
