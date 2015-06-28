/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import data.Enummer;
import ddfplayer.Player;
import general.GameController;
import general.Race;
import general.Roleofplayer;
import java.util.HashMap;
import map.Room;

/**
 *
 * @author Andrew
 */
public class UI {
    boolean running = true;
    GameController gc;
   
    public UI(){
          
        gc = new GameController();
        testStats();
        gc.StartGame();
      
    }
    
    public void cit(String command){
        command= command.toLowerCase();
        
        if(command.equals(Enummer.help.help.toString())){
           printEnummerHelpValues();
        }
        
        if(command.equals(Enummer.help.help_basics.toString())){
             System.out.println("Controller.getBasicCommands");
        }
        
        if(command.equals("moves")){
            gc.ShowMoves();
            
            
        }
        if(command.equals("stop")){
            running = false;
        }
        
        for(Enum e : Enummer.Moves.values()){
            if(command.equals(e.toString())){
                gc.Move(e);
            }
        }
                      
      
        
        if(command.equals("room")){
            gc.room();
        }
        if(command.equals("stats")){
            gc.printActivePlayer();
        }
    }
    
 
    void printEnummerHelpValues(){
        
    }
    
    

    
    public boolean isRunning() {
        return running;
    }
    
    
    final void testStats(){
        HashMap t = new HashMap();
        t.put(Enummer.attributes.strength, 10);
        t.put(Enummer.attributes.constituion, 10);
        t.put(Enummer.attributes.charisma, 10);
        t.put(Enummer.attributes.agility, 10);
        t.put(Enummer.attributes.wisdom, 10);
        t.put(Enummer.attributes.intellegence, 10);
        Race r = new Race(Enummer.Race.dwarf);
        Roleofplayer rop = new Roleofplayer(5);
        
        Player p = new Player("Bob",2,t,r,rop);
        p.setHp(10);
        gc.addPlayer(p);
        
        
    }
    
    
    
}
