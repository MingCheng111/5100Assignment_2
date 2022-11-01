/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author mingcheng
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;
    private Patient patient;
    
    
    public EncounterHistory(Patient patient){
        this.encounterHistory = new ArrayList<Encounter>(); 
        this.patient = patient;
        
        
        
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    
    
      
    

}
