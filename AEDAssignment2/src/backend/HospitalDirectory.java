/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author rutujaghate
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory(){
        this.hospitalDirectory=new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHoshistory() {
        return hospitalDirectory;
    }

    public void setHoshistory(ArrayList<Hospital> hoshistory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    public Hospital addHospital(){
        Hospital newHospital = new Hospital();
        hospitalDirectory.add(newHospital);
        return newHospital;
    }
}
