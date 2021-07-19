/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Usuario
 */
public class Users extends People{   
    private String school;
    private String major;
    
    public Users(
            int id,
            String name, 
            String lastname,
            String address, 
            String email, 
            String school,
            String major){
        super(id, name, lastname, address, email);
        this.school = school;
        this.major = major;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }
    
    
}
