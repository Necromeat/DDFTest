/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.SQLException;
import map.DungeonMap;

/**
 *
 * @author Andrew
 */
public class GatewayMapper {
    private DungeonsGateway dg = new DungeonsGateway();
    private DungeonMap dm = new DungeonMap();
     public GatewayMapper(){
        
    }
     
     public DungeonMap getADungeon() throws SQLException{
         //dg.getSpecificDungeon(Name);
         dm = new DungeonMap(dg.loadDungeonsAll());
         
         return dm;
         
     }
}
