/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfcombat;

import UI.UI;
import data.Enummer;
import data.Filehandler;
import ddfplayer.Player;
import java.util.HashMap;
import general.Race;
import general.Roleofplayer;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DDFCombat {
    private ArrayList<String> od = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DDFCombat df = new DDFCombat();
            //df.shitter();
            //df.testStats();
            //df.testRace();
            // TODO code application logic here
            //df.TestRoomloader();
        df.testUI();
        
    }
    
    
    
    
    
    public void testRace(){
        Race r = new Race(Enummer.Race.dwarf);
        r.getRace();
    }
    
    public void TestRoomloader() throws FileNotFoundException{
        Filehandler f = new Filehandler();
        f.loadRooms();
    }
    
    public void testUI(){
        UI i = new UI();
        
        while(i.isRunning()){
          
            Scanner scan = new Scanner(System.in);
            i.cit(scan.next());
        }
    }
}
