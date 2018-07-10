package Dominio;

public class NotaNumerica extends Nota {

	public NotaNumerica(String nota) {
		this.nota = nota;
	}

	public boolean aprobada() {
		return Integer.parseInt(nota) > 5;
	}
}
