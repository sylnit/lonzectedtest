/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author SAM
 */
public class Dtime {
    private String time;
    private Integer id;
    
    public void setTime(String dtime){
        this.time = dtime;
    }
    
    public void setId(Integer id){
        this.id= id;
    }
    
    public String getTime(){
        return this.time;
    }
    
    public Integer getId(){
        return this.id;
    }
}
