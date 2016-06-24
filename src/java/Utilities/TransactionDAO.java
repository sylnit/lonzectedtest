/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author SAM
 */
public class TransactionDAO {
    
    public String generateTransactionId(String transType,Integer userId){
        String transId = this.genTransId(userId);
        saveTransId(transId, transType, userId);
        return transId;
    }
    
    /*public boolean exists(String transId){
        Connection conn = Util.getConnection();
        String sql = "select * from transactions where id=?";
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, transId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                rs.close();
                conn.close();
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
    }*/
    
    private String genTransId(Integer userId){
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
        //String timeStamp = "1329388477";
        return (timeStamp+userId.toString());
    }
    
    private boolean saveTransId(String transId, String transType, Integer userId){
        Connection conn = Util.getConnection();
        String sql = "insert into transactions(transaction_id,transaction_type,user_id) values(?,?,?)";
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, transId);
            ps.setString(2, transType);
            ps.setInt(3, userId);
            Integer result = ps.executeUpdate();
            if(result >0){
                ps.close();
                conn.close();
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
    
    public static String getTransactionId(String transType, Integer userId){
        Connection conn = Util.getConnection();
        String sql = "select * from transactions where transaction_type=? and id=? order by id desc limit 1";
        PreparedStatement ps;
        String transId = "";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, transType);
            ps.setInt(2, userId);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                transId = rs.getString("transaction_id");
            }
            //return transId;
        }catch(Exception e){
            
        }finally{
            try{
                conn.close();
            }catch(Exception e){
                //log the error
            }
        }
        return transId;
    }
    
    //end of class definti
}
