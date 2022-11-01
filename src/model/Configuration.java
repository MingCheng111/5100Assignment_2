/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class Configuration {
    
    public static System configur(){
           
    System sys = new System();
    
    sys.setCity(new City());
    
    Hospital h1 = new Hospital("h1");
    Hospital h2 = new Hospital("h2");
    Hospital h3 = new Hospital("h3");
    Hospital h4 = new Hospital("h4");
    Hospital h5 = new Hospital("h5");
    
    sys.getHospitalDir().getHospitalList().add(h1);
    sys.getHospitalDir().getHospitalList().add(h2);
    sys.getHospitalDir().getHospitalList().add(h3);
    sys.getHospitalDir().getHospitalList().add(h4);
    sys.getHospitalDir().getHospitalList().add(h5);
       
  
    
    Person p1 = new Person("lily",38,"Boston","backbay","106",null);
    Person p2 = new Person("jay",28,"Boston","backbay","140",null);
    Person p3 = new Person("adam",33,"Boston","backbay","98 saint",null);
    Person p4 = new Person("alex",23,"Boston","backbay","36",null);
    Person p5 = new Person("claire",65,"Boston","backbay","100 saint",null);
    Person p6 = new Person("cindy",43,"Boston","backbay","92 saint",null);
    Person p7 = new Person("ethan",68,"Boston","backbay","105",null);
    Person p8 = new Person("eason",14,"Boston","backbay","125",null);
    Person p9 = new Person("david",88,"Boston","backbay","100",null);
    Person p10 = new Person("danny",42,"Boston","backbay","165",null);
    
    sys.getPersonDir().getPersontList().add(p1);
    sys.getPersonDir().getPersontList().add(p2);
    sys.getPersonDir().getPersontList().add(p3);
    sys.getPersonDir().getPersontList().add(p4);
    sys.getPersonDir().getPersontList().add(p5);
    sys.getPersonDir().getPersontList().add(p6);
    sys.getPersonDir().getPersontList().add(p7);
    sys.getPersonDir().getPersontList().add(p8);
    sys.getPersonDir().getPersontList().add(p9);
    sys.getPersonDir().getPersontList().add(p10);
    
    
    
   Patient pt1 = new Patient(p1);
   p1.setPatient(pt1);
   Patient pt2 = new Patient(p2);
   p2.setPatient(pt2);
   Patient pt3 = new Patient(p3);
   p3.setPatient(pt3);
   Patient pt4 = new Patient(p4);
   p4.setPatient(pt4);
   Patient pt5 = new Patient(p5);
   p5.setPatient(pt5);
   Patient pt6 = new Patient(p6);
   p6.setPatient(pt6);
   Patient pt7 = new Patient(p7);
   p7.setPatient(pt7);
   Patient pt8 = new Patient(p8);
   p8.setPatient(pt8);
   Patient pt9 = new Patient(p9);
   p9.setPatient(pt9);
   Patient pt10 = new Patient(p10);
   p10.setPatient(pt10);

    Doctor d1 = new Doctor("Joe","HospitalOne");
    Doctor d2 = new Doctor("Jane","HospitalOne");
    Doctor d3 = new Doctor("John","HospitalTwo");
    Doctor d4 = new Doctor("Jannis","HospitalTwo");
    Doctor d5 = new Doctor("Ann","HospitalThree");
    Doctor d6 = new Doctor("Carl","HospitalThree");
    Doctor d7 = new Doctor("Tom","HospitalFour");
    Doctor d8 = new Doctor("Jim","HospitalFour");
    
    
    sys.getDoctorDir().getDoctorList().add(d1);
    sys.getDoctorDir().getDoctorList().add(d2);
    sys.getDoctorDir().getDoctorList().add(d3);
    sys.getDoctorDir().getDoctorList().add(d4);
    sys.getDoctorDir().getDoctorList().add(d5);
    sys.getDoctorDir().getDoctorList().add(d6);
    sys.getDoctorDir().getDoctorList().add(d7);
    sys.getDoctorDir().getDoctorList().add(d8);
  
    
   sys.getPatientdir().getPatientList().add(pt1);
   sys.getPatientdir().getPatientList().add(pt2);
   sys.getPatientdir().getPatientList().add(pt3);
   sys.getPatientdir().getPatientList().add(pt4);
   sys.getPatientdir().getPatientList().add(pt5);
   sys.getPatientdir().getPatientList().add(pt6);
   sys.getPatientdir().getPatientList().add(pt7);
   sys.getPatientdir().getPatientList().add(pt8);
   sys.getPatientdir().getPatientList().add(pt9);
   sys.getPatientdir().getPatientList().add(pt10);
   
   
   

    
    
   VitalSigns v1= new VitalSigns(d1,50.0,100.0);
   VitalSigns v2 = new VitalSigns(d2,50.0,100.0);
   VitalSigns v3 = new VitalSigns(d3,50.0,100.0);
   VitalSigns v4 = new VitalSigns(d4,50.0,100.0);
   VitalSigns v5 = new VitalSigns(d5,50.0,100.0);
   VitalSigns v6 = new VitalSigns(d1,50.0,100.0);
   VitalSigns v7 = new VitalSigns(d2,50.0,100.0);
   VitalSigns v8 = new VitalSigns(d3,50.0,100.0);
   VitalSigns v9 = new VitalSigns(d4,50.0,100.0);
   VitalSigns v10 = new VitalSigns(d5,50.0,100.0);
   

    
    Encounter e1= new Encounter(pt1,d1,"21-10-2022",v1);
    Encounter e2= new Encounter(pt2,d2,"21-10-2022",v2 );
    Encounter e3= new Encounter(pt2,d3,"21-10-2022",v3 );
    Encounter e4= new Encounter(pt4,d4,"21-10-2022",v4);
    Encounter e5= new Encounter(pt5,d5,"21-10-2022",v5 );
    Encounter e6= new Encounter(pt6,d6,"21-10-2022",v6 );
    Encounter e7= new Encounter(pt7,d7,"21-10-2022",v7);
    Encounter e8= new Encounter(pt8,d8,"21-10-2022",v8);
    Encounter e9= new Encounter(pt9,d8,"21-10-2022",v9 );
    Encounter e10= new Encounter(pt10,d8,"21-10-2022",v10 );

    pt1.getEh().getEncounterHistory().add(e1);
    pt2.getEh().getEncounterHistory().add(e2);
    pt3.getEh().getEncounterHistory().add(e3);
    pt4.getEh().getEncounterHistory().add(e4);
    pt5.getEh().getEncounterHistory().add(e5);
    pt6.getEh().getEncounterHistory().add(e6);
    pt7.getEh().getEncounterHistory().add(e7);
    pt8.getEh().getEncounterHistory().add(e8);
    pt9.getEh().getEncounterHistory().add(e9);
    pt10.getEh().getEncounterHistory().add(e10);
        return sys;
    }
    
}
