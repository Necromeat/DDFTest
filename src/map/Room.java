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
    private double roomNorth, roomEast, roomSouth,roomWest,roomnumber,roomup,roomdown; 
    private boolean entranceNorth, entranceSouth,entranceEast,entranceWest,stairsup,stairsdown;
    
    public Room(double roomnumber, String name,String desrip,double roomNorht,double roomSouth,double roomEast,double roomWest,double up,double down,String Random,String specifik,String... String){
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
        
    }
    
    public Room(){
        
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }
    
    

    public double getRoomnumber() {
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

    public double getRoomNorth() {
        return roomNorth;
    }

    public double getRoomEast() {
        return roomEast;
    }

    public double getRoomSouth() {
        return roomSouth;
    }

    public double getRoomWest() {
        return roomWest;
    }

    public double getRoomup() {
        return roomup;
    }

    public double getRoomdown() {
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
    public void resetChoices(){
        entranceNorth = false;
        entranceSouth = false;
        entranceEast = false;
        entranceWest = false;
        stairsup = false;
        stairsdown = false;
    }
    
    public String toString(){
        return "\nYou are standing in: " + name +"\nIt looks like:" + desrip +""+entranceNorth+":"+entranceSouth;
        
    }
    
    public String getSpecificMonster(){
        return specific;
    }
    
   public boolean hasMonster(){
        return !specific.equals("1000.1");
   
   }
   
  
}
