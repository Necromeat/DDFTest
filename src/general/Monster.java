/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import data.Enummer;
import ddfinterfaces.Monsterinterface;
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
public class Monster  extends Characterado implements Monsterinterface {
    private String name;
    private Location loc;
    private List<Item> equipment = new ArrayList();
    private Enum alligenmet;
    private Enum aggrassion;
    private Race race;
    private HashMap<Enum,Integer> attributes;
    private List<Item> inventory = new ArrayList();
    private int id;
    private int hp; 

    public Monster() {
    }

    public Monster(String name, HashMap attributes, int id, int hp,Enum aggrassion) {
        this.name = name;
        this.attributes = attributes;
        this.id = id;
        this.hp = hp;
        setHP();
        this.aggrassion = aggrassion;
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
        return aggrassion;
    }

    @Override
    public boolean rightlocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDamage() {
        Random ran = new Random();
        for(Item i :equipment){
            if(i.getItemType().equals(Enummer.Equipment.weapon)){
               
                Weapon w = (Weapon)i;
                return w.getDamage()+modifierCalculation(getStr());
            }
        }
        
        return ran.nextInt(3)+1+modifierCalculation(getStr());
        
        
    }

    @Override
    public void addItemtoInventory(Item i) {
        inventory.add(i);}

    @Override
    public void addItemtoEquipment(Item i) {
        equipment.add(i);
    }

   
    
    
}
