/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import map.Room;

/**
 *
 * @author Andrew
 */
public class Filehandler {
   ArrayList<String> temp = new ArrayList<>();
   ArrayList<String> temp2 = new ArrayList<>();
   ArrayList<Room> rooms = new ArrayList<>();
    
    
    public void loadRooms() throws FileNotFoundException{
         final String path= "F:\\Users\\Andrew\\Documents\\temp\\DDFm.csv";
          String nextLine = "";
          String lineReader = "";
          Scanner fileScan = new Scanner(new FileInputStream(path)).useDelimiter("[!#!]");
      
        while(fileScan.hasNext()){
        nextLine = fileScan.next();
        Scanner lineScan1 = new Scanner(nextLine).useDelimiter("[#]");
        lineReader = lineScan1.next();
        
        Scanner lineScan = new Scanner(lineReader).useDelimiter("[;]");
        while(lineScan.hasNext()){
                        
           rooms.add(new Room(cast(lineScan.next()),lineScan.next(),lineScan.next(),cast(lineScan.next()),cast(lineScan.next()),cast(lineScan.next()),cast(lineScan.next()),cast(lineScan.next()),cast(lineScan.next()),lineScan.next(),lineScan.next(),lineScan.next(),lineScan.next(),lineScan.next(),lineScan.next(),lineScan.next(),lineScan.next()));
       
        }
        
       
         
        }
               
        
      }  
    
    public List<Room> getRooms(){
        return rooms;
    }
    
    
   
    
    double cast(String a){
            System.out.println(a.toString());
            return Double.parseDouble(a); 
    }
}
