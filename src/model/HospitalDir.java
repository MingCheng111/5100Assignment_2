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
public class HospitalDir {
     private ArrayList<Hospital> hospitalList;
     private DoctorDir doctDir;
    
    public HospitalDir(){
        hospitalList = new ArrayList<Hospital>(); 
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public DoctorDir getDoctDir() {
        return doctDir;
    }

    public void setDoctDir(DoctorDir doctDir) {
        this.doctDir = doctDir;
    }

    
    
}
