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
public class VitalsDirectory {
    private ArrayList<Vitals> vitalshistory;
    
    public VitalsDirectory(){
       this.vitalshistory=new ArrayList<Vitals>();
        
    }

    public ArrayList<Vitals> getVitalshistory() {
        return vitalshistory;
    }

    public void setVitalshistory(ArrayList<Vitals> vitalshistory) {
        this.vitalshistory = vitalshistory;
    }
    public Vitals addVitals(){
        Vitals newVitals = new Vitals();
        vitalshistory.add(newVitals);
        return newVitals;
    }
    public void deleteVitals(Vitals newVitals){
        vitalshistory.remove(newVitals);
    }
    
}
