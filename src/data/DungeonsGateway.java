/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import map.Room;

/**
 *
 * @author Andrew
 */
public class DungeonsGateway {

    public DungeonsGateway() {
    }
    
    
    public List<Room> loadDungeonsAll() throws SQLException{
        ArrayList<Room> list = new ArrayList<>();
        Statement stmt = null;
       String SQLString1 ="SELECT * "+ "FROM dungeonrooms";
       ConnectionTools t = new ConnectionTools();
       
     Connection con = ConnectionTools.getCurrentConnection();
     PreparedStatement statement = null;
   try {
        statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
        while (rs.next()) {

            Room r = new Room();
           
        r.setRoomnumber (rs.getInt("room_number"));
        
        if(rs.getInt("Connecting_room_east") != 99){
                   r.setEntranceEast(true);
        r.setRoomEast(rs.getInt("connecting_room_east"));
        }else{
        
            r.setEntranceEast(false);
        }
        if(rs.getInt("Connecting_room_west") != 99){
         
         r.setEntranceWest(true);
        r.setRoomWest(rs.getInt("Connecting_room_west"));
        }else{
            
            r.setEntranceWest(false);
        }
        if(rs.getInt("connecting_room_north") != 99){
                r.setRoomNorth(rs.getInt("connecting_room_north"));
        r.setEntranceNorth(true);
        }else{
         
            r.setEntranceNorth(false);
        }
        if(rs.getInt("Connecting_room_south") != 99){      
        r.setRoomSouth(rs.getInt("Connecting_room_south"));
        r.setEntranceSouth(true);
        }else{
            
            r.setEntranceSouth(false);
        }
        
        if(rs.getInt("Connecting_room_up") != 99){
         
               r.setStairsup(true);
        r.setRoomup(rs.getInt("Connecting_room_up"));
        }else{
            
            r.setStairsup(false);
        }
        if(rs.getInt("Connecting_room_down") != 99){
         
        r.setRoomdown(rs.getInt("Connecting_room_down"));
        r.setStairsdown(true);
        }else{
           
            r.setStairsdown(false);
        }
        r.setDesrip(rs.getString(("room_Description")));
        r.setName(rs.getString("room_name"));
        if(rs.getInt("Monster_Specific") != 99){
                   r.setSpecific(""+rs.getInt("Monster_Specific"));
        }
        list.add(r);
            
            
        }
        
    } catch (SQLException e ) {
        System.out.println(e.toString());
    } finally {
     ConnectionTools.getCurrentConnection().close();
        if (stmt != null) { stmt.close();  }
    }
    return list;
    } 
}
