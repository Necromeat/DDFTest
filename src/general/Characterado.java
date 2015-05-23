/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.List;
import java.util.Map;
import map.Location;


/**
 *
 * @author Andrew
 */
public abstract class Characterado {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract Location getLocation();
    public abstract Roleofplayer getRole();
    public abstract List<Item> getEquipment();
    public abstract int getHp();
    public abstract void setHp(int hp);
    public abstract List<Item> getInventory();
    public abstract Enum getAlligenment();
    public abstract Race getRace();
    public abstract List<Map> getAtributes();
    public abstract int getIniative();
    public abstract int getID();
    public abstract int getStr();
    public abstract int getCon();
    public abstract int getAgil();
    public abstract int getInt();
    public abstract int getWis();
    public abstract int getChar();
    public abstract void updateInv(List<Item> items);
    
}
