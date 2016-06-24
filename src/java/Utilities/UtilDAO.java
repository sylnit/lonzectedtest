/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SAM
 */
public class UtilDAO {
    
    public List<Destination> getDestinations(){
        Connection con = Util.getConnection();
        String sql = "select * from destinations order by id asc";
        PreparedStatement ps;
        List<Destination> destinationList = new ArrayList<Destination>();
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String destinationName = rs.getString("destination");
                Integer id = rs.getInt("id");
                Destination destination = new Destination();
                destination.setDestination(destinationName);
                destination.setId(id);
                destinationList.add(destination);
                //System.out.println("Destination:"+destinationName);
            }
            //System.out.println(destinationList);
            con.close();
            //return destinationList;
        }catch(Exception e){
            //you can log the exception
            e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(Exception e){
                //log the error
            }
        }
        return destinationList;
    }
    
    public List<Dtime> getTimes(){
        Connection con = Util.getConnection();
        String sql = "select * from departure_times order by departure_time asc";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Dtime> timeList = new ArrayList<Dtime>();
            while(rs.next()){
                String departureTime = rs.getString("departure_time");
                Integer id = rs.getInt("id");
                Dtime dtime = new Dtime();
                dtime.setTime(departureTime);
                dtime.setId(id);
                timeList.add(dtime);
                //System.out.println(departureTime);
            }
            con.close();
            return timeList;
        }catch(Exception e){
            //you can log the exception
        }finally{
            try{
                con.close();
            }catch(Exception e){
                //log the error
            }
        }
        return null;
    }
    
    public List<VisitDate> getVisitDates(){
        Connection conn = Util.getConnection();
        String sql = "select * from visit_dates";
        PreparedStatement ps;
        List<VisitDate>  visitDateList = new ArrayList<VisitDate>();
        try{
            ps =conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String visitdate = rs.getString("visit_date");
                Integer id = rs.getInt("id");
                VisitDate vDateObj = new VisitDate();
                vDateObj.setId(id);
                vDateObj.setVdate(visitdate);
                visitDateList.add(vDateObj);
            }
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                //log the error
            }
        }
        return visitDateList;
    }
    
    public List<VisitTime> getVisitTimes(){
        Connection conn = Util.getConnection();
        String sql = "select * from visit_times";
        PreparedStatement ps;
        List<VisitTime>  visitTimeList = new ArrayList<VisitTime>();
        try{
            ps =conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String visittime = rs.getString("visit_time");
                Integer id = rs.getInt("id");
                VisitTime vTimeObj = new VisitTime();
                vTimeObj.setId(id);
                vTimeObj.setVtime(visittime);
                visitTimeList.add(vTimeObj);
            }
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                //log the error
            }
        }
        return visitTimeList;
    }
    
    public List<Location> getLocations(){
        Connection conn = Util.getConnection();
        String sql = "select * from locations";
        PreparedStatement ps;
        List<Location>  locationList = new ArrayList<Location>();
        try{
            ps =conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String location = rs.getString("location");
                Integer id = rs.getInt("id");
                Location locationObj = new Location();
                locationObj.setId(id);
                locationObj.setLocation(location);
                locationList.add(locationObj);
            }
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                //log the error
            }
        }
        return locationList;
    }
    
    public List<CheckupPack> getSubpacks(){
        Connection conn = Util.getConnection();
        String sql = "select * from subscription_packs";
        PreparedStatement ps;
        List<CheckupPack>  subpackList = new ArrayList<CheckupPack>();
        try{
            ps =conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String subpack = rs.getString("subpack");
                Integer id = rs.getInt("id");
                CheckupPack subpackObj = new CheckupPack();
                subpackObj.setId(id);
                subpackObj.setPack(subpack);
                subpackList.add(subpackObj);
            }
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                //log the error
            }
        }
        return subpackList;
    }
    
    //end of class definition
}
