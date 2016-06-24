/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author SAM
 */
public class MedicalBooking {
    private Integer id;
    private String name;
    private String phone;
    private String subpack;
    private String location;
    private String visitdate;
    private String visittime;
    private Integer amount;
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public void setSubpack(String subpack){
        this.subpack = subpack;
    }
    
    public String getSubpack(){
        return this.subpack;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public void setVisitdate(String visitdate){
        this.visitdate = visitdate;
    }
    
    public String getVisitdate(){
        return this.visitdate;
    }
    
    public void setVisittime(String visittime){
        this.visittime = visittime;
    }
    
    public String getVisittime(){
        return this.visittime;
    }
    
    public void setAmount(Integer amt){
        this.amount = amt;
    }
    
    public Integer getAmount(){
        return this.amount;
    }
    
    //end of class definition
}
