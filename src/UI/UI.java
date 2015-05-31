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
        gc.StartGame();
          HashMap t = new HashMap();
        t.put(Enummer.attributes.Strength, 10);
        Race r = new Race(Enummer.Race.Dwarf);
        Roleofplayer rop = new Roleofplayer();
        Player p = new Player("Bob",2,t,r,rop);
        System.out.println(p.getName());
        System.out.println("Player Str"+p.getStr());
        System.out.println("HP" + p.getHp());
        gc.addPlayer(p);
        
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
            printMoves();
            
            
        }
        if(command.equals("stop")){
            running = false;
        }
        
        if(command.equals("north")){
            gc.Move(Enummer.Moves.North);
        }
        if(command.equals("south")){
             gc.Move(Enummer.Moves.South);
        }
        if(command.equals("west")){
                   gc.Move(Enummer.Moves.West);
        }
        if(command.equals("east")){
                  gc.Move(Enummer.Moves.East);
        }
        if(command.equals("up")){
                  gc.Move(Enummer.Moves.up);
        }
        if(command.equals("down")){
                gc.Move(Enummer.Moves.down);
        }
        
        if(command.equals("room")){
            gc.room();
        }
    }
    
 
    void printEnummerHelpValues(){
         for(Enum e: Enummer.help.values()){
                    System.out.println(e.toString());
                }
    }
    
    void printMoves(){
        gc.ShowMoves();
        
    }

    
    public boolean isRunning() {
        return running;
    }
    
    
    
      
}
