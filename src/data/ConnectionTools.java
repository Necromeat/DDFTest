/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Andrew
 */
public class ConnectionTools {  
     private final String userName = "DDF";
     private final String password = "Maow02";
     private final String serverName = "192.168.1.13";
     private final String portNumber = "3306";
     private String dbms;
     private static Connection con = null;
    private ConnectionTools instance;
    
    
    public ConnectionTools() {
        try{
     
     Class.forName("com.mysql.jdbc.Driver").newInstance();
    Properties connectionProps = new Properties();
    connectionProps.put("user", this.userName);
    connectionProps.put("password", this.password);
    dbms = "mysql";
    if (this.dbms.equals("mysql")) {
        con = DriverManager.getConnection(
                   "jdbc:" + this.dbms + "://" +
                   this.serverName +
                   ":" + this.portNumber + "/"+"ddt2",
                   connectionProps);
           
        }
     }
        catch (Exception e) {
            System.out.println("error in Connection");
            System.out.println(e);
        }
        
    }

   
    
    public static Connection getCurrentConnection() {
      if(con !=null){
            return con;
      }return null;
        
        
    }
      
    public void closeInstance(){
        
            try {
           con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
  
    
}
