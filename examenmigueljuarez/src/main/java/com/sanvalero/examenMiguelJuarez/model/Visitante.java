package com.sanvalero.examenMiguelJuarez.model;

public class Visitante {

	private String Email;
	private String Contraseña;
	
	
	public Visitante(String email, String contraseña) {
		super();
		Email = email;
		Contraseña = contraseña;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	
	
}
