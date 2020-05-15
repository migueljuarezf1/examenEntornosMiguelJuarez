package com.sanvalero.examenMiguelJuarez.model;

import java.time.LocalDate;

public class Alumnos extends Colegio {
	
	private String Nombre;
	private String Apellidos;
	private int Curso;
	private String Email;
	private LocalDate Fecha_Nacimiento;


	
		public Alumnos(String nombre_Colegio, String direccion, String email, String contraseña, String persona_Contacto,
			String nombre, String apellidos, int curso, String email2, LocalDate fecha_Nacimiento) {
		super(nombre_Colegio, direccion, email, contraseña, persona_Contacto);
		Nombre = nombre;
		Apellidos = apellidos;
		Curso = curso;
		Email = email2;
		Fecha_Nacimiento = fecha_Nacimiento;
	}



		public String getNombre() {
			return Nombre;
		}



		public void setNombre(String nombre) {
			Nombre = nombre;
		}



		public String getApellidos() {
			return Apellidos;
		}



		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}



		public int getCurso() {
			return Curso;
		}



		public void setCurso(int curso) {
			Curso = curso;
		}



		public String getEmail() {
			return Email;
		}



		public void setEmail(String email) {
			Email = email;
		}



		public LocalDate getFecha_Nacimiento() {
			return Fecha_Nacimiento;
		}



		public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
			Fecha_Nacimiento = fecha_Nacimiento;
		}	
	
	
		
		

}
