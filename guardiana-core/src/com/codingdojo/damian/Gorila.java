package com.codingdojo.damian;

public class Gorila extends Mamifero{
	private int lanzarAlgo;
	private int comerBananas;
	private int escalar;
	
	public Gorila(int nivelDeEnergia, int lanzarAlgo, int comerBananas, int escalar) {
		super(nivelDeEnergia);
		this.lanzarAlgo = lanzarAlgo;
		this.comerBananas = comerBananas;
		this.escalar = escalar;
	}
	public int getLanzarAlgo() {
		
		
		nivelDeEnergia =  nivelDeEnergia - lanzarAlgo;
		
		return lanzarAlgo;
	}
	
	public void setLanzarAlgo(int lanzarAlgo) {
		this.lanzarAlgo = lanzarAlgo;
	}
	
	public int getComerBananas() {
		
		nivelDeEnergia =  nivelDeEnergia + comerBananas;
		
		return comerBananas;
	}
	
	public void setComerBananas(int comerBananas) {

		this.comerBananas = comerBananas;
	}
	
	public int getEscalar() {
		
		nivelDeEnergia = nivelDeEnergia - escalar;
		
		return escalar;
	}
	
	public void setEscalar(int escalar) {
		this.escalar = escalar;
	}
	
}
