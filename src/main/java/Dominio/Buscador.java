package Dominio;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Buscador {
	int legajo;
	Estudiante estudiante;

	public Buscador(int legajo) {
		this.legajo = legajo;
	}

	public void buscarEstudiante() {
		estudiante = RepositorioEstudiantes.getInstancia().buscarPorLegajo(legajo);
	}

}
