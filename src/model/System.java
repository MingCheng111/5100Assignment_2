/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class System {
    private PatientDir patientdir;
    private DoctorDir doctorDir;
    private PersonDir personDir;
    private HospitalDir hospitalDir;
    private City city;
    
    
    
    public System(){
        this.patientdir= new PatientDir();
        this.doctorDir = new DoctorDir();
        this.personDir = new PersonDir();
      this.hospitalDir = new HospitalDir();
        
    }

    public PatientDir getPatientdir() {
        return patientdir;
    }

    public void setPatientdir(PatientDir patientdir) {
        this.patientdir = patientdir;
    }

    public DoctorDir getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(DoctorDir doctorDir) {
        this.doctorDir = doctorDir;
    }

    public PersonDir getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDir personDir) {
        this.personDir = personDir;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public HospitalDir getHospitalDir() {
        return hospitalDir;
    }

    public void setHospitalDir(HospitalDir hospitalDir) {
        this.hospitalDir = hospitalDir;
    }
    
     public Doctor findDoc(String doctorName){
         for(Doctor doc:this.getDoctorDir().getDoctorList()){
            if(doc.getName().equals(doctorName)){
               return doc;
    
    } 
 
         }
         return null;
     }  
  
   
}
