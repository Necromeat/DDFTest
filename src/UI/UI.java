/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import data.Enummer;

/**
 *
 * @author Andrew
 */
public class UI {
    
    public void cit(String command){
        command= command.toLowerCase();
        
        if(command.equals(Enummer.help.help.toString())){
           printEnummerHelpValues();
        }
        
        if(command.equals(Enummer.help.help_basics.toString())){
             System.out.println("Controller.getBasicCommands");
        }
    }
    
 
    void printEnummerHelpValues(){
         for(Enum e: Enummer.help.values()){
                    System.out.println(e.toString());
                }
    }
}
