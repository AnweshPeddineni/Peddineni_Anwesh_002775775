/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anweshpeddineni
 */
public class ProfileList {
    
    private ArrayList<EmployeeDetails> list;
    
    public ProfileList(){
        this.list = new ArrayList<EmployeeDetails>();
    }

    public ArrayList<EmployeeDetails> getList() {
        return list;
    }

    public void setList(ArrayList<EmployeeDetails> list) {
        this.list = list;
    }
    
    public EmployeeDetails addNewEmployee(){
        EmployeeDetails newProfile = new EmployeeDetails();
        list.add(newProfile);
        return newProfile;
    }
    
    public void deleteemployees(EmployeeDetails ed){
        
        list.remove(ed);
    }
    
}
