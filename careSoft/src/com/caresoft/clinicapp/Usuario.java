package com.caresoft.clinicapp;

public class Usuario {
    protected Integer id;
    protected int pin;
	
    
  
    
    public Usuario(Integer id) {
		super();
		this.id = id;
	}
	
	
	public Usuario(Integer id, int pin) {

		this.id = id;
		this.pin = pin;
	}


	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
    
    // PARA HACER: Getters y Setters
    // Implementar un constructor que tome un ID
}