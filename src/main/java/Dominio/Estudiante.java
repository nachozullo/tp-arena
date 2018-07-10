package Dominio;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Estudiante {
	String nombre;
	String apellido;
	int legajo;
	String usuarioGit;

	public Estudiante(String nombre, String apellido, int legajo, String usuarioGit) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGit = usuarioGit;
	}

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

	public boolean esLegajo(int legajo) {
		return this.legajo == legajo;
	}

}
