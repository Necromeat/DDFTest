/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import data.DungeonsGateway;
import data.Enummer;
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
   
    
     
    public GameController() throws SQLException {
        //d.getDungeonroomsCollection();
      testStats();
//        try {
////            f.loadRooms();
//            
//            System.out.println("Map loaded");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(GameController.class.getName()).log(Level.SEVERE, null, ex);
//        }
      newDungeon();
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
    
    private void newDungeon()  throws SQLException{
       DungeonsGateway dg = new DungeonsGateway();
       ArrayList<Room> list;
       list = (ArrayList<Room>) dg.loadDungeonsAll();
       for(Room r : list){
           System.out.println("++++++++++++++++++++++++++++++++++");
                      System.out.println(r.toString());
           System.out.println("------------------------------------");
       }
     
         
       dm = new DungeonMap(list);

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
