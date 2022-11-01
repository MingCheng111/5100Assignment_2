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


public class Doctor {
    String name;
    String hospital;
    ArrayList<VitalSigns> vitalSigns;

    public Doctor(String name, String hospital){
        this.name = name;
        this.hospital = hospital;
        this.vitalSigns = new ArrayList<>();
 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public ArrayList<VitalSigns> getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(ArrayList<VitalSigns> vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
  
    
}


