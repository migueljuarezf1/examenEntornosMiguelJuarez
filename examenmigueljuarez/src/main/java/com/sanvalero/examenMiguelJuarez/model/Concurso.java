package com.sanvalero.examenMiguelJuarez.model;

import java.util.ArrayList;
import java.util.List;

public class Concurso {

	private String Nombre_Concurso;
	private String Pagina_Web;
	
	// Lista de usuarios registrados en la web
	 List<Visitante> usuarios;
	
	
	public Concurso(String nombre_Concurso, String pagina_Web) {
		super();
		Nombre_Concurso = nombre_Concurso;
		Pagina_Web = pagina_Web;
	}

	public Concurso() {
		usuarios = new ArrayList();
		 }
	
	public void puntuar(Visitante usuario, Cuadros cuadro, int puntos) throws Exception {
		 if (!usuarios.contains(usuario)) {
		 throw new Exception("Debes estar registrado para poder puntuar");
		 }
		 int puntuacion = 0;
		if ((puntuacion < 0) || (puntuacion > 5)) {
		 throw new Exception("");
		 }
		 cuadro.sumarPuntuacion(puntuacion);
		 }

	
	public String getNombre_Concurso() {
		return Nombre_Concurso;
	}



	public void setNombre_Concurso(String nombre_Concurso) {
		Nombre_Concurso = nombre_Concurso;
	}



	public String getPagina_Web() {
		return Pagina_Web;
	}



	public void setPagina_Web(String pagina_Web) {
		Pagina_Web = pagina_Web;
	}
	
	
	
	
}
