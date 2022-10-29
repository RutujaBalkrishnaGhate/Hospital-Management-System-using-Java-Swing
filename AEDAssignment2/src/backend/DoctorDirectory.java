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
public class DoctorDirectory {
    private ArrayList<Doctor> dochistory;
    
    public DoctorDirectory(){
        this.dochistory=new ArrayList<Doctor>();
    
    }

    public ArrayList<Doctor> getDochistory() {
        return dochistory;
    }

    public void setDochistory(ArrayList<Doctor> dochistory) {
        this.dochistory = dochistory;
    }
    
}
