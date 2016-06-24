/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author SAM
 */
public class Location {
    private String location;
    private Integer id;
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public void setId(Integer id){
        this.id= id;
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    //end of class definition
}
