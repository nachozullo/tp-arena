package Dominio;

public class NotaConceptual implements Nota {
	String nota;

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getNota() {
		return nota;
	}

	public boolean aprobada() {
		return !(nota.contains("M"));
	}

}
