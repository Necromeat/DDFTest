/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import data.Enummer;
import ddfplayer.Player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class DungeonMap {
    private ArrayList<Room> room = new ArrayList<>();
    private Room currentRoom;
 
    
    public DungeonMap(List<Room> rooms){
        for(Room r : rooms){
            this.room.add(r);
        }
         
        
        
    }
    
    public void moveIntoNextRoom(Room activeroom){
        this.currentRoom = activeroom;                     
        setter();
        
   }
    
    public Room getCurrentRoom(){
        return currentRoom;
    }
    
    
    void setter(){
        if(currentRoom.getRoomNorth() == 1000.1){
            currentRoom.setEntranceNorth(false);
        }else{
            currentRoom.setEntranceNorth(true);
        }
        if(currentRoom.getRoomSouth() == 1000.1){
            currentRoom.setEntranceSouth(false);
        }else{
            currentRoom.setEntranceSouth(true);
        }
        if(currentRoom.getRoomEast() == 1000.1){
            currentRoom.setEntranceEast(false);
        }else{
            currentRoom.setEntranceEast(true);
        }
        if(currentRoom.getRoomWest() == 1000.1){
            currentRoom.setEntranceWest(false);
        }else{
            currentRoom.setEntranceWest(true);
        }
        if(currentRoom.getRoomdown()== 1000.1){
            currentRoom.setStairsdown(false);
        }else{
            currentRoom.setStairsdown(true);
        }
        if(currentRoom.getRoomup() == 1000.1){
            currentRoom.setStairsup(false);
        }else{
            currentRoom.setStairsup(true);
        }
        
    }
    
    public void setStartRoomPlayer(String name){
       if(!name.equals("start")){
        for(Room r : room){
            if(r.getName().equals(name)){
                currentRoom = r;
            }
        }
       }
        moveIntoNextRoom(room.get(0));
    }
    
    
    public void Move(Enum move){
        
        if(move == Enummer.Moves.North && currentRoom.isEntranceNorth()){
          setCurrentRoomById(currentRoom.getRoomNorth());
        }
        
        if(move == Enummer.Moves.East && currentRoom.isEntranceEast()){
             setCurrentRoomById(currentRoom.getRoomEast());
        }
        
        if(move == Enummer.Moves.South && currentRoom.isEntranceSouth()){
             setCurrentRoomById(currentRoom.getRoomSouth());
        }
        
        if(move == Enummer.Moves.West && currentRoom.isEntranceWest()){
             setCurrentRoomById(currentRoom.getRoomWest());
        }
        if(move == Enummer.Moves.down && currentRoom.isStarisdown()){
             setCurrentRoomById(currentRoom.getRoomdown());
        }
        if(move == Enummer.Moves.up && currentRoom.isStairsup()){
             setCurrentRoomById(currentRoom.getRoomup());
        }
    }
    
    
    void setCurrentRoomById(double id){
     
        for (Room r:room) {
            if(id == r.getRoomnumber() ){                  
                moveIntoNextRoom(r);   
            }
        }
    }
}
