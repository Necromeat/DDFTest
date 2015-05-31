/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import data.Enummer;
import ddfinterfaces.Monsterinterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import map.Location;

/**
 *
 * @author Andrew
 */
public class Monster  extends Characterado implements Monsterinterface {
    private String name;
    private Location loc;
    private List<Item> equipment;
    private Enum alligenmet;
    private Race race;
    private HashMap attributes;
    private List<Item> inventory;
    private int id;
    private int hp; 

    public Monster() {
    }

    public Monster(String name, Location loc, HashMap attributes, int id, int hp) {
        this.name = name;
        this.loc = loc;
        this.attributes = attributes;
        this.id = id;
        this.hp = hp;
        setHP();
    }
    
    
    @Override
    public String getName() {
        return name;
    }

   
    @Override
    public Location getLocation() {
        return loc;
    }

    

    @Override
    public List<Item> getEquipment() {
        return equipment;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public List<Item> getInventory() {
        return inventory;
    }

    @Override
    public Enum getAlligenment() {
        return alligenmet;
    }

    @Override
    public Race getRace() {
        return race;
    }

    @Override
    public List<Map> getAtributes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIniative() {
        return modifierCalculation(getAgil());
    
    }

    @Override
    public int getID() {
    return id;
    }

    @Override
    public int getStr() {
    int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Strength);
    return i;
    }

    @Override
    public int getCon() {int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Constituion);
    return i;}

    @Override
    public int getAgil() {
      int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Agility);
    return i;
    }

    @Override
    public int getInt() {
        int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Intellegence);
    return i;
    }

    @Override
    public int getWis() { int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Wisdom);
    return i;}

    @Override
    public int getChar() { int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Charisma);
    return i;}
    
   

    @Override
    public void updateInv(List<Item> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     final void buildStats(){
        attributes.put(Enummer.attributes.Strength, 12);
        attributes.put("Agility", 12);
        attributes.put("Constitution", 12);
        attributes.put("Wisdom", 12);
        attributes.put("Intellegence", 12);
        attributes.put("Charsima", 12);
                
    }
     
     int modifierCalculation(int attribute){
         int i = (attribute-10)/2;
         return i;
     }
     
     final void setHP(){
         this.hp = this.hp+modifierCalculation(getCon());
     }
            

    @Override
    public int getWeaponSkill() {
        return 3 ;
    }

    //Will build a way to get values
    @Override
    public int getDefense() {
        return 4;
    
    }

    @Override
    public Roleofplayer getRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> getloot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enum getAggression() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rightlocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDamage() {
        Random ran = new Random();
        int i = ran.nextInt(10)+1+modifierCalculation(getStr());
        return i ;
    }
    
    
}
