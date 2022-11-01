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
public class PersonDir {
    
    private ArrayList<Person> personList;
    
    public PersonDir(){
        this.personList = new ArrayList<Person>(); 
    
    }

    public ArrayList<Person> getPersontList() {
        return personList;
    }

    public void setPersontList(ArrayList<Person> persontList) {
        this.personList = persontList;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
     
    }
    
    public void deletePerson(Person person){
        personList.remove(person);
        
    }
    
    
}
