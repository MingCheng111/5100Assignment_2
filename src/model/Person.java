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
public class Person {
   
    private String  name;
    private int  age;
    

    
    private String city;
    private String community;
    private String house;
    private Patient patient;
      
    public Person(String name, int age, String city, String community, String house,Patient patient) {
        
        this.name= name;
        this.age = age;
        
        this.city = city;
        this.community = community;
        this.house = house;
        this.patient = patient;
}

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Person(){
        
    }

    @Override
    public String toString() {
        return this.name;
    }

  
}
