package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA{
	private Integer id;
	private Date date;
	
    // Dentro de la clase:    
    private ArrayList<String> patientNotes;
	



	// PARA HACER: Constructor que tome un ID
    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
	
//    public Physician(Integer id) {
//		this.id = id;
//	}
//    
    public Physician(Integer id) {
		super(id);
	}




	public boolean assignPin(int pin) {
    	if(pin < 999 || pin > 9999) {
    		return false;
    	}else {
    		return true;
    	}
    }
    
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(id == confirmedAuthID) {
    		return true;
    	}else {
    		return false;
    				
    	}
    }

	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}




	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
    // PARA HACER: Setters y Getters
}
