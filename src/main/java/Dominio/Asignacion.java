package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
	String nombre;
	List<Nota> listaNotas = new ArrayList<Nota>();

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
	public Nota notaActual() {
		return listaNotas.get(listaNotas.size() - 1);
	}

	public boolean estaAprobada() {
		return listaNotas.get(listaNotas.size() - 1).aprobada();
	}

}
