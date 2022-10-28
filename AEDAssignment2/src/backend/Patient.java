/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import javax.swing.ImageIcon;

/**
 *
 * @author rutujaghate
 */
public class Patient {
    private String patientName;
    private int pid; 
    private int age; 
    private String gender;  
    
    
    public int getPid() {
        return pid;
    }

    public void setPid(int eid) {
        this.pid = pid;
    }

    
   public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String name) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
