/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;


/**
 *
 * @author mingcheng
 * 
 
 */
public class DoctorDir {
    private ArrayList<Doctor> doctorList;
    
    public DoctorDir(){
        doctorList = new ArrayList<Doctor>(); 
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    
    

}
