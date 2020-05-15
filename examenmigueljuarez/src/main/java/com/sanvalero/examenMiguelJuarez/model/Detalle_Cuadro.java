package com.sanvalero.examenMiguelJuarez.model;

import java.time.LocalDate;

public class Detalle_Cuadro extends Cuadros {

	private String Tecnica_Utilizada; 
	private int Ancho;
	private int Alto;
	private int Puntuacion_Recibida;
	
	
	
	public Detalle_Cuadro(String nombre_Colegio, String direccion, String email, String contraseña,
			String persona_Contacto, String nombre, String apellidos, int curso, String email2,
			LocalDate fecha_Nacimiento, String nombre_Alumno, String nombre_Cuadro, String tecnica_Utilizada, int ancho,
			int alto, int puntuacion_Recibida) {
		super(nombre_Colegio, direccion, email, contraseña, persona_Contacto, nombre, apellidos, curso, email2,
				fecha_Nacimiento, nombre_Alumno, nombre_Cuadro);
		Tecnica_Utilizada = tecnica_Utilizada;
		Ancho = ancho;
		Alto = alto;
		Puntuacion_Recibida = puntuacion_Recibida;
	}



	public String getTecnica_Utilizada() {
		return Tecnica_Utilizada;
	}



	public void setTecnica_Utilizada(String tecnica_Utilizada) {
		Tecnica_Utilizada = tecnica_Utilizada;
	}



	public int getAncho() {
		return Ancho;
	}



	public void setAncho(int ancho) {
		Ancho = ancho;
	}



	public int getAlto() {
		return Alto;
	}



	public void setAlto(int alto) {
		Alto = alto;
	}



	public int getPuntuacion_Recibida() {
		return Puntuacion_Recibida;
	}



	public void setPuntuacion_Recibida(int puntuacion_Recibida) {
		Puntuacion_Recibida = puntuacion_Recibida;
	}
	
	
	
	
	
	
}
