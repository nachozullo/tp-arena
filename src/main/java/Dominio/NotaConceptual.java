package Dominio;

public class NotaConceptual extends Nota {
	
	public NotaConceptual(String nota) {
		this.nota = nota;
	}

	public boolean aprobada() {
		return !(nota.contains("M"));
	}

}
