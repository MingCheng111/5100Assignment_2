/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class Encounter {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private VitalSigns vitalSigns;
    
    public Encounter(Patient patient, Doctor doctor, String date, VitalSigns vit){
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.vitalSigns = vit;
        this.vitalSigns.setEncounter(this);
        
    }

    public Encounter(VitalSigns vit) {
        this.vitalSigns = vit;
        this.vitalSigns.setEncounter(this);
    }


  
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }


   
}
