package ddfinterfaces;

import general.Item;
import general.Race;
import java.util.List;
import java.util.Map;
import map.Location;
import general.Roleofplayer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public abstract interface Characteradointerface {
    String getName();
    void setName(String name);
    Location getLocation();
    Roleofplayer getRole();
    List<Item> getEquipment();
    int getHp();
    void setHp(int hp);
    List<Item> getInventory();
    Enum getAlligenment();
    Race getRace();
    List<Map> getAtributes();
    int getIniative();
    int getID();
    int getStr();
    int getCon();
    int getAgil();
    int getInt();
    int getWis();
    int getChar();
    
            
}
