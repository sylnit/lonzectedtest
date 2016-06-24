/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author SAM
 */
public class TransportBooking {
    
    private Integer id;
    private String name;
    private String phone;
    private String nk;
    private String nkp;
    private Integer amount;
    private String destination;
    private String ddate;
    private String dtime;
    
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
    
    public void setNk(String nk){
        this.nk = nk;
    }
    
    public String getNk(){
        return this.nk;
    }
    
    public void setNkp(String nkp){
        this.nkp = nkp;
    }
    
    public String getNkp(){
        return this.nkp;
    }
    
    public void setAmount(Integer amt){
        this.amount = amt;
    }
    
    public Integer getAmount(){
        return this.amount;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public void setDdate(String ddate){
        this.ddate = ddate;
    }
    
    public String getDdate(){
        return this.ddate;
    }
    
    public void setDtime(String dtime){
        this.dtime = dtime;
    }
    
    public String getDtime(){
        return this.dtime;
    }
    
    //end of class defintion
}
