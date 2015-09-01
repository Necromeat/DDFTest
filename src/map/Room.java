package map;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author dekez
 */
public class Room {
    private String name,specific;
    private String desrip;
    private int roomNorth, roomEast, roomSouth,roomWest,roomnumber,roomup,roomdown; 
    private boolean entranceNorth, entranceSouth,entranceEast,entranceWest,stairsup,stairsdown;
    
    public Room(int roomnumber, String name,String desrip,int roomNorht,int roomSouth,int roomEast,int roomWest,int up,int down,String Random,String specifik,String... String){
        this.roomNorth = roomNorht;
        this.roomEast = roomEast;
        this.roomSouth = roomSouth;
        this.roomWest = roomWest;
        this.roomup = up;
        this.roomdown = down;
        this.name = name;
        this.desrip = desrip;
        this.roomnumber = roomnumber;
        this.specific = specifik;
        entranceNorth = false;
        entranceSouth = false;
        entranceEast = false;
        entranceWest = false;
        stairsup = false;
        stairsdown = false;
        
    }
    
    public Room(){
        
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }
    
    

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setEntranceNorth(boolean entranceNorth) {
        this.entranceNorth = entranceNorth;
    }

    public void setEntranceSouth(boolean entranceSouth) {
        this.entranceSouth = entranceSouth;
    }

    public void setEntranceEast(boolean entranceEast) {
        this.entranceEast = entranceEast;
    }

    public void setEntranceWest(boolean entranceWest) {
        this.entranceWest = entranceWest;
    }

    public int getRoomNorth() {
        return roomNorth;
    }

    public int getRoomEast() {
        return roomEast;
    }

    public int getRoomSouth() {
        return roomSouth;
    }

    public int getRoomWest() {
        return roomWest;
    }

    public int getRoomup() {
        return roomup;
    }

    public int getRoomdown() {
        return roomdown;
    }

   

    public void setStairsup(boolean stairsup) {
        this.stairsup = stairsup;
    }

    public void setStairsdown(boolean stairsdown) {
        this.stairsdown = stairsdown;
    }

    
    public String getName() {
        return name;
    }

   
    public String getDesrip() {
        return desrip;
    }
    
       public boolean isEntranceNorth() {
        return entranceNorth;
    }

    public boolean isEntranceSouth() {
        return entranceSouth;
    }

    public boolean isEntranceEast() {
        return entranceEast;
    }

    public boolean isEntranceWest() {
        return entranceWest;
    }
     public boolean isStairsup() {
        return stairsup;
    }

    public boolean isStarisdown() {
        return stairsdown;
    }


    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", specific=" + specific + ", desrip=" + desrip + ", roomNorth=" + roomNorth + ", roomEast=" + roomEast + ", roomSouth=" + roomSouth + ", roomWest=" + roomWest + ", roomnumber=" + roomnumber + ", roomup=" + roomup + ", roomdown=" + roomdown + ", entranceNorth=" + entranceNorth + ", entranceSouth=" + entranceSouth + ", entranceEast=" + entranceEast + ", entranceWest=" + entranceWest + ", stairsup=" + stairsup + ", stairsdown=" + stairsdown + '}';
    }
    
   
    
    public String getSpecificMonster(){
        return specific;
    }
    
   public boolean hasMonster(){
       if(specific == null){
           return false;
       }
      
        return true;
   
   }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesrip(String desrip) {
        this.desrip = desrip;
    }

    public void setRoomNorth(int roomNorth) {
        this.roomNorth = roomNorth;
    }

    public void setRoomEast(int roomEast) {
        this.roomEast = roomEast;
    }

    public void setRoomSouth(int roomSouth) {
        this.roomSouth = roomSouth;
    }

    public void setRoomWest(int roomWest) {
        this.roomWest = roomWest;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public void setRoomup(int roomup) {
        this.roomup = roomup;
    }

    public void setRoomdown(int roomdown) {
        this.roomdown = roomdown;
    }
   
   
  
}
