/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package health;

import Utilities.MedicalBooking;
import Utilities.TransactionDAO;
import Utilities.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SAM
 */
public class HealthDAO {
    public Integer bookCheckup(String[] args){
        String sql = "INSERT INTO `checkup_booking`(`subpack_id`, `location_id`, `visit_date_id`, `visit_time_id`, `name`, `phone`) VALUES (?,?,?,?,?,?)";
        Connection conn = Util.getConnection();
        PreparedStatement ps;
        Integer insertedId = 0;
        try{
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Integer.parseInt(args[0]));
            ps.setInt(2, Integer.parseInt(args[1]));
            ps.setInt(3, Integer.parseInt(args[2]));
            ps.setInt(4, Integer.parseInt(args[3]));
            ps.setString(5, args[4]);
            ps.setString(6, args[5]);
            Integer result = ps.executeUpdate();
            if(result > 0){
                ResultSet returnedData = ps.getGeneratedKeys();
                if(returnedData.next()){
                    insertedId = returnedData.getInt(1);
                }
                if(insertedId != 0){
                    TransactionDAO tdao = new TransactionDAO();
                    tdao.generateTransactionId("checkup booking",insertedId);
                }
            }
            return insertedId;
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                
            }
        }
        return insertedId;
    }
    
    public MedicalBooking getBooking(Integer bookingId){
        Connection conn = Util.getConnection();
        String sql = "select * from checkup_booking where id=?";
        PreparedStatement ps;
        MedicalBooking bookingDetails = new MedicalBooking();
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bookingId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                Integer id = rs.getInt("id");
                String subpack = rs.getString("subpack");
                String location = rs.getString("location");
                String visitdate = rs.getString("visitdate");
                String visittime = rs.getString("visittime");
                Integer amount = rs.getInt("amount");
                MedicalBooking mbooking = new MedicalBooking();
                mbooking.setName(name);
                mbooking.setId(id);
                mbooking.setSubpack(subpack);
                mbooking.setLocation(location);
                mbooking.setVisitdate(visitdate);
                mbooking.setVisittime(visittime);
                mbooking.setAmount(amount);
                //System.out.println("Destination:"+destinationName);
            }
            //System.out.println(destinationList);
            //con.close();
            //return destinationList;
        }catch(Exception e){
            //you can log the exception
            e.printStackTrace();
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                
            }
        }
        return bookingDetails;
    }
    
    //end of class definition
}
