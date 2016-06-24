/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

import Utilities.TransactionDAO;
import Utilities.TransportBooking;
import Utilities.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SAM
 */
public class TransportDAO {
        
    
    public Integer bookTransport(String[] args){
        String sql = "INSERT INTO `transport_booking`(`name`, `phone`, `next_of_kin`, `next_of_kin_phone`, `destination_id`, `departure_date`, `departure_time_id`) VALUES (?,?,?,?,?,?,?)";
        Connection conn = Util.getConnection();
        PreparedStatement ps;
        Integer insertedId = 0;
        try{
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, args[0]);
            ps.setString(2, args[1]);
            ps.setString(3, args[2]);
            ps.setString(4, args[3]);
            ps.setString(5, args[4]);
            ps.setString(6, args[5]);
            ps.setString(7, args[6]);
            Integer result = ps.executeUpdate();
            if(result > 0){
                ResultSet returnedData = ps.getGeneratedKeys();
                if(returnedData.next()){
                    insertedId = returnedData.getInt(1);
                }
                if(insertedId != 0){
                    TransactionDAO tdao = new TransactionDAO();
                    tdao.generateTransactionId("transport booking",insertedId);
                }
            }
            conn.close();
            return insertedId;
        }catch(Exception e){
            
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                //Logger.getLogger(TransportDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return insertedId;
    }
    
    public TransportBooking getBooking(Integer bookingId){
        Connection conn = Util.getConnection();
        String sql = "select tb.id,tb.name,tb.phone,tb.next_of_kin,tb.next_of_kin_phone,d.destination,d.amount,tb.departure_date,dt.departure_time from transport_booking tb join destinations d on d.id=tb.destination_id join departure_times dt on dt.id=tb.departure_time_id where tb.id=?";
        PreparedStatement ps;
        //List<TransportBooking> bookingDetails = new ArrayList<TransportBooking>();
        TransportBooking tbooking = new TransportBooking();
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bookingId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                Integer id = rs.getInt("id");
                String phone = rs.getString("phone");
                String nk = rs.getString("next_of_kin");
                String nkp = rs.getString("next_of_kin_phone");
                Integer amount = rs.getInt("amount");
                String destination = rs.getString("destination");
                //TransportBooking tbooking = new TransportBooking();
                tbooking.setName(name);
                tbooking.setId(id);
                tbooking.setAmount(amount);
                tbooking.setPhone(phone);
                tbooking.setNk(nk);
                tbooking.setNkp(nkp);
                tbooking.setDestination(destination);
                //bookingDetails.add(tbooking);
                //System.out.println("Destination:"+destinationName);
            }
            //System.out.println(destinationList);
            conn.close();
            return tbooking;
        }catch(Exception e){
            //you can log the exception
            e.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                //Logger.getLogger(TransportDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tbooking;
    }
    
    //end of class definition
}
