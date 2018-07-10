package Dominio;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

public class Asignacion {
	String nombre;
	List<Nota> listaNotas = new ArrayList<Nota>();
	String ultimaNota;
	
	public Asignacion(String nombre, Nota nota) {
		this.nombre = nombre;
		listaNotas.add(nota);
		this.ultimaNota = listaNotas.get(listaNotas.size() - 1).getNota();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}

	/* Supuestamente es la ultima nota */
	public String getUltimaNota() {
		return ultimaNota;
	}
	
	public void setUltimaNota(String nota) {
		this.ultimaNota = nota;
	}

	public boolean estaAprobada() {
		return listaNotas.get(listaNotas.size() - 1).aprobada();
	}

}
