package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	String nombre;
	String apellido;
	int legajo;
	String usuarioGit;
	List<Asignacion> asignaciones = new ArrayList<>();

	public Estudiante(String nombre, String apellido, int legajo, String usuarioGit) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGit = usuarioGit;
	}

	/********************* GETTERS *******************/
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getLegajo() {
		return legajo;
	}

	public String getUsuarioGit() {
		return usuarioGit;
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

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}
	
	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}
	
	/********************* METHODS *******************/

	public boolean esLegajo(int legajo) {
		return this.legajo == legajo;
	}

	public void agregarAsignacion(Asignacion asignacion) {
		asignaciones.add(asignacion);
	}
}
