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
public class PatientDir {
     private ArrayList<Patient> patientList;
    
    public PatientDir(){
        this.patientList = new ArrayList<Patient>(); 
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addNewPatient(Person p){
        Patient newPatient = new Patient(p);
        patientList.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patient patient){
        patientList.remove(patient);
        
    }
    
    
    
}
