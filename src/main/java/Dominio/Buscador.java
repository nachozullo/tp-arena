package Dominio;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Buscador {
	Estudiante estudiante;
	RepositorioEstudiantes repositorio;
	int legajo;
	String nombre;
	String apellido;
	String usuarioGit;
	List<Asignacion> asignaciones = new ArrayList<>();
	
	public Buscador(RepositorioEstudiantes repo) {
		this.repositorio = repo;
	}
	
	/********************* GETTERS *******************/
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getUsuarioGit() {
		return usuarioGit;
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}	
	
	public RepositorioEstudiantes getRepositorio() {
		return repositorio;
	}
	
	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}
	
	/********************* SETTERS *******************/
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	

	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public void setRepositorio(RepositorioEstudiantes repositorio) {
		this.repositorio = repositorio;
	}
	
	/********************* METHODS *******************/
	
	public void buscarEstudiante() {
		estudiante = repositorio.buscarPorLegajo(legajo);
		this.nombre = estudiante.getNombre();
		this.apellido = estudiante.getApellido();
		this.usuarioGit = estudiante.getUsuarioGit();
		this.asignaciones = estudiante.getAsignaciones();
	}


}
