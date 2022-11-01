/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mingcheng
 */
public class City {
    private HospitalDir hospitalDir;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public HospitalDir getHospitalDir() {
        return hospitalDir;
    }

    public void setHospitalDir(HospitalDir hospitalDir) {
        this.hospitalDir = hospitalDir;
    }
    public City(){
        this.hospitalDir = new HospitalDir();
         this.community = new Community("Boston");
    }
    
}
