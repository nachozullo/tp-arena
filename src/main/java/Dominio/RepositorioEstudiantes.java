package Dominio;

import java.util.ArrayList;
import java.util.Arrays;

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

	public void agregarEstudiantes(Estudiante[] estudiantes) {
		listaEstudiantes.addAll(Arrays.asList(estudiantes));
	}

	public Estudiante devolverPrimerEstudiante() {
		return listaEstudiantes.get(0);
	}

	public Estudiante buscarPorLegajo(int legajo) {
		return listaEstudiantes.stream().filter(estudiante -> estudiante.esLegajo(legajo)).findFirst().orElse(null);
	}

}
