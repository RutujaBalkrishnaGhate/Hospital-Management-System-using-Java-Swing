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
public class EncounterDirectory {
    private ArrayList<Encounter> encounterhistory;
    
    public EncounterDirectory(){
        this.encounterhistory=new ArrayList<Encounter>();
        
    }

    public ArrayList<Encounter> getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(ArrayList<Encounter> encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
    
    public Encounter addEncounter(){
        Encounter newEncounter = new Encounter();
        encounterhistory.add(newEncounter);
        return newEncounter;
    }

    
}
