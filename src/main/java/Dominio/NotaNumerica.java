package Dominio;

public class NotaNumerica implements Nota {
	int nota;

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public boolean aprobada() {
		return nota > 5;
	}
}
