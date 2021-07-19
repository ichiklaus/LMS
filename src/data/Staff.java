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
public class Staff extends People{
    private String post;
    
    public Staff(){}
    public Staff(
            int id,
            String name, 
            String lastname,
            String address, 
            String email,              
            String post){
        super (id, name, lastname, address, email);
        this.post = post;
    }


    /**
     * @return the position
     */
    public String getPost() {
        return post;
    }

    /**
     * @param position the position to set
     */
    public void setPost(String position) {
        this.post = position;
    }

    
    
}
