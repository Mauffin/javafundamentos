package com.codingdojo.damian;

public class TestGorila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorila monito = new Gorila(100,5,10,10);
		
	
		
		System.out.println("monito lanzo algo y pierde "+monito.getLanzarAlgo()+" de energia");
		
		System.out.println("energia de monito "+monito.getNivelDeEnergia());
		System.out.println("monito lanzo algo y pierde "+monito.getLanzarAlgo()+" de energia");
		System.out.println("energia de monito "+monito.getNivelDeEnergia());
		System.out.println("monito lanzo algo y pierde "+monito.getLanzarAlgo()+" de energia");
		
		
		System.out.println("energia de monito: "+monito.getNivelDeEnergia());
		
		System.out.println("\n");
		
		System.out.println("monito comiendo banana wii: "+monito.getComerBananas());
		System.out.println("energia de monito: "+monito.getNivelDeEnergia());
		System.out.println("monito comiendo banana wii:"+monito.getComerBananas());
		
		System.out.println("energia de monito: "+monito.getComerBananas()+ " U A A!  ");
	
		System.out.println("monito aburrido subio el arbol y perdio: "+ monito.getEscalar()+" de energia");
		
		System.out.println("energia de monito: "+monito.getNivelDeEnergia());
		
		System.out.println("\n");
		
		Murcielago murciegalo = new Murcielago(300,50,25,100);
		
		
		System.out.println("energia de murciegalo: "+murciegalo.nivelDeEnergia);
		
		System.out.println("*el pueblo esta en llamas* ayuda el murciegalo lo destruye todo AAAAAAH!!!(atacar a un pueblo cuesta:) "+murciegalo.getAtacarPueblo()+" de Energia");
		System.out.println("*el pueblo esta en llamas* ayuda el murciegalo lo destruye todo AAAAAAH!!!(atacar a un pueblo cuesta:) "+murciegalo.getAtacarPueblo()+" de Energia");
		System.out.println("*el pueblo esta en llamas* ayuda el murciegalo lo destruye todo AAAAAAH!!!(atacar a un pueblo cuesta:) "+murciegalo.getAtacarPueblo()+" de Energia");
		System.out.println("murciegalo ya no tiene energia :C "+murciegalo.nivelDeEnergia);
		System.out.println("*omñom omñom omñom omñom* murciegalo se alimenta de humanos y recupera: "+murciegalo.getComerHumano()+" de Energia");
		System.out.println("energia de murciegalo: "+murciegalo.nivelDeEnergia);
		System.out.println("*omñom omñom omñom omñom* murciegalo se alimenta de humanos y recupera: "+murciegalo.getComerHumano()+" de Energia");
		System.out.println("*aleteo aleteo*(volar cuesta): "+murciegalo.getVolar()+" de energia");
		System.out.println("murciegalo ya no tiene energia :C"+murciegalo.nivelDeEnergia);
		System.out.println("*aleteo aleteo*(volar cuesta): "+murciegalo.getVolar()+" de energia");
		System.out.println("murciegalo quedo endeudado :c"+murciegalo.nivelDeEnergia);
		
	}

}
