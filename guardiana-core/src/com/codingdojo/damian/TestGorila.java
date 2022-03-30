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
		
		System.out.println("\n\n");
		
		System.out.println("monito comiendo banana wii: "+monito.getComerBananas());
		System.out.println("energia de monito: "+monito.getNivelDeEnergia());
		System.out.println("monito comiendo banana wii:"+monito.getComerBananas());
		
		System.out.println("energia de monito: "+monito.getComerBananas()+ " U A A!  ");
	
		System.out.println("monito aburrido subio el arbol y perdio: "+ monito.getEscalar()+" de energia");
		
		System.out.println("energia de monito: "+monito.getNivelDeEnergia());
		
		
		
		
	}

}
