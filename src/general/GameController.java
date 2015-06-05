/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import data.Filehandler;
import ddfplayer.Player;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import map.DungeonMap;
import map.Room;

/**
 *
 * @author Andrew
 */
public class GameController {
    private Filehandler f = new Filehandler();
    private ArrayList<Player>players = new ArrayList<>();
    private ArrayList<Monster>monsters = new ArrayList<>();
    private DungeonMap dm;
    private Combatter com = new Combatter();
     
    public GameController() {
        
        try {
            f.loadRooms();
            
            System.out.println("Map loaded");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
        }
      newDungeon();
    }
    
    public void StartGame(){
        System.out.println("Welcome");
       dm.setStartRoomPlayer("start");
        
    }
    
    public void Move(Enum move){
        dm.Move(move);
        if(dm.getCurrentRoom().hasMonster()){
            com.fight(players, monsters, players);
        }
    }
    
    public void room(){
        System.out.println("You are standing in"+dm.getCurrentRoom().getName()+"id: "+dm.getCurrentRoom().getRoomnumber());
    }
    
    public void ShowMoves(){
        
        if(dm.getCurrentRoom().isEntranceEast()){
            System.out.println("You can move East");
        }else{
            System.out.println("You cannot go East");
        }
        if(dm.getCurrentRoom().isEntranceNorth()){
            System.out.println("You can Move North");
        }
        else{
            System.out.println("You cannot go North");
        }
        if(dm.getCurrentRoom().isEntranceSouth()){
            System.out.println("You can move South");
        }
        else{
            System.out.println("You cannot go South");
        }
        if(dm.getCurrentRoom().isEntranceWest()){
            System.out.println("You can move West");
        }
        else{
            System.out.println("You cannot go West");
        }
         if(dm.getCurrentRoom().isStarisdown()){
            System.out.println("You can move down");
        }
        else{
            System.out.println("You cannot go down");
        }
          if(dm.getCurrentRoom().isStairsup()){
            System.out.println("You can move up");
        }
        else{
            System.out.println("You cannot go up");
        }
        
    }
    
    private void newDungeon(){
          dm = new DungeonMap(f.getRooms());
    }
    
    public void Combat(List<Player> players,List<Monster> monsters){
        
        Combatter com = new Combatter();
        com.fight(players, monsters, players);
    }
    
    public void addPlayer(Player p){
        players.add(p);
    }
    
    public String getPlayerName(Player p){
        return p.getName();
    }
    
    public void addMonsters(Monster a){
        monsters.add(a);
    }
}
