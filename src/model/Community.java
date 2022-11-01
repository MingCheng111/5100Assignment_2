/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class Community {

    String name;
    PersonDir personDir;
    
    public Community(String name){
     
        this.name = name;
   
        
    }
    



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    public PersonDir getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDir personDir) {
        this.personDir = personDir;
    }


    
    
    
}
