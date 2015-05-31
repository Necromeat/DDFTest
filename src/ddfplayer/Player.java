/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfplayer;

import data.Enummer;
import ddfinterfaces.Playerinterface;
import general.Characterado;
import general.Item;
import general.Race;
import general.Roleofplayer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import map.Location;

/**
 *
 * @author Andrew
 */
public class Player extends Characterado implements Playerinterface {
    private String name;
    private Location loc;
    private Roleofplayer rop;
    private List<Item> equipment;
    private Enum alligenmet;
    private Race race;
    private HashMap attributes;
    private List<Item> inventory;
    private int id;
    private int hp; 
        

    public Player(String name,int hp,Location loc, Roleofplayer rop,List<Item> equipment,List<Item> inventory, Enum alligenment,Race race, HashMap attributes, int id) {
        this.name = name;
        this.id = id;
        this.loc = loc;
        this.rop = rop;
        this.equipment = equipment;
        this.alligenmet = alligenment;
        this.race = race;
        this.attributes = attributes;       
        this.hp = hp;
        this.inventory = inventory;
        
    }
    
    public Player(String name,int hp,HashMap attributes,Race race,Roleofplayer rp){
         this.name = name;
        this.attributes = attributes;       
        this.hp = hp;
        this.race = race;
        this.rop = rp;
        setHP();
    }
   
      

    @Override
    public void fight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void interact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public Roleofplayer getRole() {
        return rop;
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
    i = (Integer)attributes.get(Enummer.attributes.Strength)+ race.getRaceStrMod();
    return i;
    }

    @Override
    public int getCon() {int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Constituion)+ race.getRaceConMod();
    return i;}

    @Override
    public int getAgil() {
      int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Agility)+ race.getRaceAgiMod();
    return i;
    }

    @Override
    public int getInt() {
        int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Intellegence)+ race.getRaceIntMod();
    return i;
    }

    @Override
    public int getWis() { int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Wisdom)+ race.getRaceWisMod();
    return i;}

    @Override
    public int getChar() { int i = 0;
    i = (Integer)attributes.get(Enummer.attributes.Charisma)+ race.getRaceCharMod();
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
        attributes.put(Enummer.attributes.Strength, 10);
        attributes.put("Agility", 10);
        attributes.put("Constitution", 10);
        attributes.put("Wisdom", 10);
        attributes.put("Intellegence", 10);
        attributes.put("Charsima", 10);
                
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
        return rop.getWeaponskill();
    }

    //Will build a way to get values
    @Override
    public int getDefense() {
        return 10;
    
    }
    
    public int getDamage(){
        Random ran = new Random();
        return ran.nextInt(12)+1+modifierCalculation(getStr());
    }
}
