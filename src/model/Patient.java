/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class Patient{
    
    private Person p;
    private EncounterHistory eh;
    
    public Patient(Person p){
        this.p =p;
        eh = new EncounterHistory(this);
    }
 
    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public EncounterHistory getEh() {
        return eh;
    }

    public void setEh(EncounterHistory eh) {
        this.eh = eh;
    }

   


    
    
}
