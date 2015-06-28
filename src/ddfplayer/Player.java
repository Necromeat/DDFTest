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
import general.Weapon;
import java.util.ArrayList;
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
    private List<Item> equipment = new ArrayList<>();
    private Enum alligenmet;
    private Race race;
    private HashMap<Enum,Integer> attributes;
    private List<Item> inventory = new ArrayList<>();;
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
        updateStats();
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
    public int getStr() { return attributes.get(Enummer.attributes.strength);  }

    @Override
    public int getCon() {return attributes.get(Enummer.attributes.constituion);}

    @Override
    public int getAgil() {return attributes.get(Enummer.attributes.agility); }

    @Override
    public int getInt() {return attributes.get(Enummer.attributes.intellegence);}

    @Override
    public int getWis() { return attributes.get(Enummer.attributes.wisdom);}

    @Override
    public int getChar() { return attributes.get(Enummer.attributes.charisma);}
    
   

    @Override
    public void updateInv(List<Item> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
     
     int modifierCalculation(int attribute){
         int i = (attribute-5)%2;
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
        for(Item i :equipment){
            if(i.getItemType().equals(Enummer.Equipment.weapon)){
               
                Weapon w = (Weapon)i;
                return w.getDamage()+modifierCalculation(getStr());
            }
        }
        
        return ran.nextInt(4)+1+modifierCalculation(getStr());
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", race=" + race.toString() + ", attributes=" + attributes + ", hp=" + hp + '}';
    }
    
    final void updateStats(){
        int str = attributes.get(Enummer.attributes.strength)+race.getRaceStrMod();
        int agl = attributes.get(Enummer.attributes.agility)+race.getRaceAgiMod();
        int intle = attributes.get(Enummer.attributes.intellegence)+race.getRaceIntMod();
        int charisma = attributes.get(Enummer.attributes.charisma)+race.getRaceCharMod();
        int wisdom = attributes.get(Enummer.attributes.wisdom)+race.getRaceWisMod();
        
        attributes.put(Enummer.attributes.strength, str);
        attributes.put(Enummer.attributes.agility, agl);
        attributes.put(Enummer.attributes.intellegence, intle);
        attributes.put(Enummer.attributes.charisma, charisma);
        attributes.put(Enummer.attributes.wisdom, wisdom);
        
        
    }
    
    @Override
    public void addItemtoInventory(Item i){
        inventory.add(i);
    }
    
    @Override
    public void addItemtoEquipment(Item i){
        equipment.add(i);
    }
    
}
