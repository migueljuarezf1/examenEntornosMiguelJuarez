package com.sanvalero.examenMiguelJuarez.model;

public class Visitante {

	private String Email;
	private String Contrase�a;
	
	
	public Visitante(String email, String contrase�a) {
		super();
		Email = email;
		Contrase�a = contrase�a;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getContrase�a() {
		return Contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}
	
	
	
}
