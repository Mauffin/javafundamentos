package com.codingdojo.damian;

public class Murcielago extends Mamifero {
	private int volar;
	private int comerHumano;
	private int atacarPueblo;
	
	public Murcielago(int nivelDeEnergia, int volar, int comerHumano, int atacarPueblo) {
		super(nivelDeEnergia);
		this.volar = volar;
		this.comerHumano = comerHumano;
		this.atacarPueblo = atacarPueblo;
	}

	public int getVolar() {
		
		nivelDeEnergia =  nivelDeEnergia - volar;
		
		return volar;
	}

	public void setVolar(int volar) {
		this.volar = volar;
	}

	public int getComerHumano() {
		
		nivelDeEnergia =  nivelDeEnergia + comerHumano;
		
		return comerHumano;
	}

	public void setComerHumano(int comerHumano) {
		this.comerHumano = comerHumano;
	}

	public int getAtacarPueblo() {
		
		nivelDeEnergia =  nivelDeEnergia - atacarPueblo;
		
		return atacarPueblo;
	}

	public void setAtacarPueblo(int atacarPueblo) {
		this.atacarPueblo = atacarPueblo;
	}
	
	

}
