/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfcombat;

import UI.UI;
import data.Enummer;
import ddfplayer.Player;
import general.Item;
import java.util.HashMap;
import map.Location;
import java.util.List;
import general.Race;
import general.Roleofplayer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DDFCombat {
    private ArrayList<String> od = new ArrayList<>();
    UI ui = new UI();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DDFCombat df = new DDFCombat();
        //df.shitter();
        df.testStats();
        //df.testRace();
        // TODO code application logic here
    }
    
    public void shitter(){
         boolean running = true;
         Scanner scan = new Scanner(System.in);
         while(running){
            
             String e = scan.next();
             if(e.equals("stop")){
                 running=false;
             }else{
                 ui.cit(e);
             }
             
         }
         
    }
    
    public void testStats(){
        HashMap t = new HashMap();
        t.put(Enummer.attributes.Strength, 10);
        Race r = new Race(Enummer.Race.Dwarf);
        
        Player p = new Player("Bob",2,t,r);
        System.out.println(p.getName());
        System.out.println("Player Str"+p.getStr());
        System.out.println("HP" + p.getHp());
        
    }
    
    public void testRace(){
        Race r = new Race(Enummer.Race.Dwarf);
        r.getRace();
    }
}
