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
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPartientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addPatient(){
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patient patient){
        patientDirectory.remove(patient);
    }
    
    public Patient searchPatient(String patientName){
        for(Patient patient : this.patientDirectory){
            if(patient.getPatientName().equalsIgnoreCase(patientName)){
                return patient;
            }
        }
        return null;
    }
    
}
