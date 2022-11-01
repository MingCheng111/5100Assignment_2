/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class VitalSigns {
    private double lowPressre;
    private double highPressre;
    private Doctor doctor;
    private Encounter encounter;
    
   

    public double getLowPressre() {
        return lowPressre;
    }

    public void setLowPressre(double lowPressre) {
        this.lowPressre = lowPressre;
    }

    public double getHighPressre() {
        return highPressre;
    }

    public void setHighPressre(double highPressre) {
        this.highPressre = highPressre;
    }

    public VitalSigns(double lowPressre, double highPressre) {
        this.lowPressre = lowPressre;
        this.highPressre = highPressre;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    
   public VitalSigns(Doctor doctor) {
       this.doctor = doctor;
        this.lowPressre = 0.0f;
        this.highPressre = 0.0f;
        this.doctor.getVitalSigns().add(this);
    }
      public VitalSigns(Doctor doctor,double low,double high) {
       this.doctor = doctor;
        this.lowPressre = low;
        this.highPressre = high;
        this.doctor.getVitalSigns().add(this);
    }

    @Override
    public String toString() {
        return this.getEncounter().getDate();
    }
   
   
   
   
   
  

    
}
