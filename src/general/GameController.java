/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import data.DungeonsGateway;
import data.Enummer;
import data.GatewayMapper;
//import data.Filehandler;
import ddfplayer.Player;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import map.DungeonMap;
import map.Room;

/**
 *
 * @author Andrew
 */
public class GameController {
//    private Filehandler f = new Filehandler();
    private ArrayList<Player>players = new ArrayList<>();
    private ArrayList<Monster>monsters = new ArrayList<>();
    private DungeonMap dm;
    private Combatter com = new Combatter();
    private Monster m = new Monster();
    private Weapon w = new Weapon();
    private GatewayMapper gm = new GatewayMapper();
   
    
     
    public GameController() {
      testStats();
        try {
            newDungeon();
        } catch (SQLException ex) {
            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
        }
      buildItems();
    }
    
    public void StartGame(){
        System.out.println("Welcome");
       dm.setStartRoomPlayer("start");
        
    }
    
    public void Move(Enum move){
        System.out.println("You moved from " + dm.getCurrentRoom().getName());
        if(dm.getCurrentRoom().hasMonster() && m.getAggression().equals(Enummer.aggression.aggressive)){
            System.out.println("You encounter an "+ dm.getCurrentRoom().getSpecificMonster());
           com.fight(players, monsters, players);
           if(com.monsterDefeated()){
              dm.getCurrentRoom().setSpecific("1000.1");
           }
        }
         
        dm.Move(move);
        System.out.println("Into "+ dm.getCurrentRoom().getName());
       
    }
    
    public void room(){
        System.out.println("You are standing in"+dm.getCurrentRoom().getName()+"id: "+dm.getCurrentRoom().getRoomnumber());
    }
    
    public void ShowMoves(){
        String canMove = "You can Move: ";
        String cannotMove = "You cannot Move: ";        
           
        if(dm.getCurrentRoom().isEntranceEast()){
            System.out.println(canMove+Enummer.Moves.east.toString());
        }else{
            System.out.println(cannotMove+Enummer.Moves.east.toString());
        }
        if(dm.getCurrentRoom().isEntranceNorth()){
            System.out.println(canMove + Enummer.Moves.north.toString());
        }
        else{
            System.out.println(cannotMove+Enummer.Moves.north.toString());
        }
        if(dm.getCurrentRoom().isEntranceSouth()){
            System.out.println(canMove+Enummer.Moves.south.toString());
        }
        else{
            System.out.println(cannotMove+Enummer.Moves.south.toString());
        }
        if(dm.getCurrentRoom().isEntranceWest()){
            System.out.println(canMove+Enummer.Moves.west.toString());
        }
        else{
            System.out.println(cannotMove+Enummer.Moves.west.toString());
        }
         if(dm.getCurrentRoom().isStarisdown()){
            System.out.println(canMove+Enummer.Moves.down.toString());
        }
        else{
            System.out.println(cannotMove+Enummer.Moves.down.toString());
        }
          if(dm.getCurrentRoom().isStairsup()){
            System.out.println(canMove+Enummer.Moves.up.toString());
        }
        else{
            System.out.println(cannotMove+Enummer.Moves.up.toString());
        }
        
    }
    
    private void newDungeon()  throws SQLException{
                
       dm = gm.getADungeon();
       

    }
    
    
    
    public void addPlayer(Player p){
        p.addItemtoEquipment(w);
        players.add(p);
    }
    
    public String getPlayerName(Player p){
        return p.getName();
    }
    
    public void addMonsters(Monster a){
        monsters.add(a);
    }
    
    final void testStats(){
        HashMap t = new HashMap();
        t.put(Enummer.attributes.strength, 10);
        t.put(Enummer.attributes.constituion, 10);
        t.put(Enummer.attributes.charisma, 10);
        t.put(Enummer.attributes.agility, 10);
        t.put(Enummer.attributes.wisdom, 10);
        t.put(Enummer.attributes.intellegence, 10);
        Weapon w1 = new Weapon("Short sword", "Sword of short", 10, 2,Enummer.SlotFiller.onehand,Enummer.Equipment.martial, Enummer.Equipment.weapon);
        this.m = new Monster("Goblin",t,2,10,Enummer.aggression.aggressive);
        m.addItemtoEquipment(w1);
        addMonsters(m);
        
    }
    
   
    public void printActivePlayer(){
        System.out.println(players.get(0).toString());
    }
    
    public boolean combatActive(){
        return !com.monsterDefeated() && !com.playerDefeated();
    }
    
    private void buildItems(){
        w = new Weapon("LongSword", "Sword of long", 10, 5,Enummer.SlotFiller.onehand,Enummer.Equipment.martial, Enummer.Equipment.weapon);
         }
    
    
}
