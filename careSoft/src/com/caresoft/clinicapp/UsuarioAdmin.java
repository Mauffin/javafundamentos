package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioAdmin  extends Usuario implements UsuarioCompatibleConHIPAA,AdminCompatibleConHIPAA   {
	
    
    // Dentro de la clase:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents= new ArrayList<String>();
    
  
	public UsuarioAdmin(Integer id, String role) {
		super(id);
		this.role = role;
	}
	
	public boolean assignPin(int pin) {
    	if( pin > 9999) {
    		return true;
    	}else {
    		return false;
    	}
    }
	
	public ArrayList<String> reportSecurityIncidents(){
		return securityIncidents;
	}
	
	 public boolean accessAuthorized(Integer confirmedAuthID) {
	    	if(employeeID == confirmedAuthID) {
	    		return true;
	    	}else {
	    		return false;
	    				
	    	}
	    }
	// PARA HACER: Implementar un constructor que tome un ID y un rol
    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
    // PARA HACER: ¡Implementar AdminCompatibleConHIPAA
    
    public void newIncident(String notes) {
        String report = String.format(
            "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n", 
            new Date(), this.id, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents.add(report);
    }
    
    // PARA HACER: Setters y Getters
}
