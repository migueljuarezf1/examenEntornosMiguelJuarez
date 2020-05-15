package com.sanvalero.examenMiguelJuarez.model;

import java.time.LocalDate;

public class Cuadros extends Alumnos {

	private String Nombre_Alumno;
	private String Nombre_Cuadro;
	
	
	
	public Cuadros(String nombre_Colegio, String direccion, String email, String contraseña, String persona_Contacto,
			String nombre, String apellidos, int curso, String email2, LocalDate fecha_Nacimiento, String nombre_Alumno,
			String nombre_Cuadro) {
		super(nombre_Colegio, direccion, email, contraseña, persona_Contacto, nombre, apellidos, curso, email2,
				fecha_Nacimiento);
		Nombre_Alumno = nombre_Alumno;
		Nombre_Cuadro = nombre_Cuadro;
	}



	public String getNombre_Alumno() {
		return Nombre_Alumno;
	}



	public void setNombre_Alumno(String nombre_Alumno) {
		Nombre_Alumno = nombre_Alumno;
	}



	public String getNombre_Cuadro() {
		return Nombre_Cuadro;
	}



	public void setNombre_Cuadro(String nombre_Cuadro) {
		Nombre_Cuadro = nombre_Cuadro;
	}



	public void sumarPuntuacion(int puntuacion) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	
	
	
}
