package com.sanvalero.examenMiguelJuarez.model;

public class Colegio {
	
	private String Nombre_Colegio;
	private String Direccion;
	private String email;
	private String Contrase�a;
	private String Persona_Contacto;	

		public Colegio(String nombre_Colegio, String direccion, String email, String contrase�a, String persona_Contacto) {
		super();
		Nombre_Colegio = nombre_Colegio;
		Direccion = direccion;
		this.email = email;
		Contrase�a = contrase�a;
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

		public String getContrase�a() {
			return Contrase�a;
		}

		public void setContrase�a(String contrase�a) {
			Contrase�a = contrase�a;
		}

		public String getPersona_Contacto() {
			return Persona_Contacto;
		}

		public void setPersona_Contacto(String persona_Contacto) {
			Persona_Contacto = persona_Contacto;
		}
		
		
		
	
}
