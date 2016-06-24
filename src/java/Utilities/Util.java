/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SAM
 */
public class Util {
    
    private static final String URL = "jdbc:mysql://localhost/lonzectechdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch(Exception e){
            System.out.println("Failed to initialize the db connection. "+e);
            e.printStackTrace();
        }
        return connection;
    }
    
    
    
    //end of class definition
}
