package com.sanvalero.examenMiguelJuarez.model;

public class Detalle_Visitante extends Visitante {

	private int Valoracion;
	private int Veces_Puntuado;
	
	
	
	public Detalle_Visitante(String email, String contraseña, int valoracion, int veces_Puntuado) {
		super(email, contraseña);
		Valoracion = valoracion;
		Veces_Puntuado = veces_Puntuado;
	}



	public int getValoracion() {
		return Valoracion;
	}



	public void setValoracion(int valoracion) {
		Valoracion = valoracion;
	}



	public int getVeces_Puntuado() {
		return Veces_Puntuado;
	}



	public void setVeces_Puntuado(int veces_Puntuado) {
		Veces_Puntuado = veces_Puntuado;
	}
		
}
