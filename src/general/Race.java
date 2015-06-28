/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import data.Enummer;
import ddfinterfaces.Raceinterface;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Andrew
 */
public class Race implements Raceinterface{
    private int str,agl,wis,inte,con,charisma;
    private String discription;
    private Enum race;
    private List<Enum> alligenments = new ArrayList();
    private List<Enum> racialenemy  = new ArrayList();
    private List<Enum> slots  = new ArrayList();

    public Race(Enum race) {
        this.race = race;
        setRace();
    }
    
    

    @Override
    public String getRaceDiscription() {return discription;}

    @Override
    public Enum getRace() {return race;}

    @Override
    public int getRaceStrMod() {return str;}

    @Override
    public int getRaceAgiMod() {return agl;}

    @Override
    public int getRaceConMod() {return con;}; 
    

    @Override
    public int getRaceIntMod() {return inte;}

    @Override
    public int getRaceWisMod() {return wis;}

    @Override
    public int getRaceCharMod() {return charisma;}

    @Override
    public List<Enum> getAlligenments() {
    return alligenments;
    
    }

    @Override
    public List<Enum> getRacialEnemys() {
    return racialenemy;
    }
    
    final void setRace(){
        if(race.equals(Enummer.Race.dwarf)){
            setStr(2);
            setAgl(-2);
            setWis(2);
            setInte(0);
            setCon(2);
            setCharisma(-2);
            racialenemy.add(Enummer.Race.orc);
            alligenments.add(Enummer.alligenment.good);
            alligenments.add(Enummer.alligenment.neutral);
            discription = "Something dwarfie";
            slots.add(Enummer.Slots.head);
            slots.add(Enummer.Slots.torsoe);
            slots.add(Enummer.Slots.leg);
            slots.add(Enummer.Slots.leg);
            slots.add(Enummer.Slots.arm);
            slots.add(Enummer.Slots.arm);
            slots.add(Enummer.Slots.foot);
            slots.add(Enummer.Slots.foot);
            slots.add(Enummer.Slots.finger);
            slots.add(Enummer.Slots.finger);
            slots.add(Enummer.Slots.finger);
            slots.add(Enummer.Slots.finger);
            
            
        }
                
    }

    void setStr(int str) {
        this.str = str;
    }

    void setAgl(int agl) {
        this.agl = agl;
    }

    void setWis(int wis) {
        this.wis = wis;
    }

    void setInte(int inte) {
        this.inte = inte;
    }

    void setCon(int con) {
        this.con = con;
    }

    void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    @Override
    public List<Enum> getEquipmentSlots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
