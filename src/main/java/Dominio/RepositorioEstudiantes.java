package Dominio;

import java.util.ArrayList;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class RepositorioEstudiantes {
	private static RepositorioEstudiantes repoEstudiantes;
	private ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

	private RepositorioEstudiantes() {
	}

	public static RepositorioEstudiantes getInstancia() {
		if (repoEstudiantes == null) {
			return new RepositorioEstudiantes();
		} else {
			return repoEstudiantes;
		}
	}

	public void agregarEstudiante(Estudiante estudiante) {
		listaEstudiantes.add(estudiante);
	}

	public Estudiante devolverPrimerEstudiante() {
		return listaEstudiantes.get(0);
	}

	public Estudiante buscarPorLegajo(int legajo) {
		return listaEstudiantes.stream().filter(estudiante -> estudiante.esLegajo(legajo)).findFirst().orElse(null);
	}

}
