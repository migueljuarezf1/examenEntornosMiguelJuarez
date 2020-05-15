package com.sanvalero.examenMiguelJuarez.model;

public class Colegio {
	
	private String Nombre_Colegio;
	private String Direccion;
	private String email;
	private String Contraseña;
	private String Persona_Contacto;	

		public Colegio(String nombre_Colegio, String direccion, String email, String contraseña, String persona_Contacto) {
		super();
		Nombre_Colegio = nombre_Colegio;
		Direccion = direccion;
		this.email = email;
		Contraseña = contraseña;
		Persona_Contacto = persona_Contacto;
	}
//Creamos los getters y setters de colegio
		public String getNombre_Colegio() {
			return Nombre_Colegio;
		}

		public void setNombre_Colegio(String nombre_Colegio) {
			Nombre_Colegio = nombre_Colegio;
		}

		public String getDireccion() {
			return Direccion;
		}

		public void setDireccion(String direccion) {
			Direccion = direccion;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContraseña() {
			return Contraseña;
		}

		public void setContraseña(String contraseña) {
			Contraseña = contraseña;
		}

		public String getPersona_Contacto() {
			return Persona_Contacto;
		}

		public void setPersona_Contacto(String persona_Contacto) {
			Persona_Contacto = persona_Contacto;
		}
		
		
		
	
}
