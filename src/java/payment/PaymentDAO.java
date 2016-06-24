/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

import Utilities.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SAM
 */
public class PaymentDAO {
    public boolean savePayment(String[] args){
        String sql = "INSERT INTO `payments`(`payment_type`, `amount`, `status`, `transaction_id`, `user_id`) VALUES (?,?,?,?,?)";
        Connection conn = Util.getConnection();
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, args[0]);
            ps.setInt(2, Integer.parseInt(args[1]));
            ps.setString(3, args[2]);
            ps.setString(4, args[3]);
            ps.setInt(5, Integer.parseInt(args[4]));
            Integer result = ps.executeUpdate();
            if(result > 0){
                return true;
            }
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                //log the error
            }
        }
        return false;
    }
}
