/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
import ddfinterfaces.Combatinterface;
import ddfplayer.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Andrew
 */
public class Combatter implements Combatinterface {
    private ArrayList<Player> playerArray = new ArrayList<>();
    private Player activePlayer;
    private Monster activeMonster;
    private ArrayList<Monster> monsters = new ArrayList<>();
    private ArrayList<Characterado> characters = new ArrayList<>();

    public Combatter() {
    }  
    
    

    @Override
    public void fight(List players, List monster, List NPC) {
            Random ran = new Random();
        for (Object player : players) {
            this.playerArray.add((Player) player);
            this.characters.add((Characterado)player);
        }
        for (Object monsterer : monster){
            this.monsters.add((Monster)monsterer);            
            this.characters.add((Characterado)monsterer);
        }
     
        activePlayer = playerArray.get(0);
        activeMonster = monsters.get(0);
       
         int turn = 0;
         
        
        Characterado attacker = null ;
        Characterado defender = null ;
        
        
         if(activePlayer.getIniative()>activeMonster.getIniative()){
            attacker =(Player)activePlayer;
            defender = (Monster)activeMonster;
            System.out.println("Attacker: " + attacker.getName());
            System.out.println("Defender: " + defender.getName());
        }else{
            attacker= (Monster)activeMonster;
            defender = (Player)activePlayer;
            System.out.println("Attacker: " + attacker.getName());
            System.out.println("Defender: " + defender.getName());
        }
         
        
         
        while(fightActive()){      
            System.out.println("Turn of combat : " + turn);
            
               if(defender.getHp() <=0){
                characters.remove(defender);
                  System.out.println("Removing defender");
                  break;
            }
             if(attacker.getHp() <= 0){
                characters.remove(attacker);
                 System.out.println("Removing attacker");
                 break;
            }
        int attackerstohit = ran.nextInt(6)+1;
            System.out.println("Attacker roll: " + attackerstohit);
            System.out.println("Should hit on a 6");
        if(hit(attackerstohit,attacker.getWeaponSkill(),defender.getWeaponSkill())){
            System.out.println("Attacker hit defender for "+ attacker.getDamage());
            defender.setHp(defender.getHp()-attacker.getDamage());
            System.out.println("Defender has "+defender.getHp()+" HP Left");
            
        }else{
            System.out.println("Attacker missed");
        }
        
        int defendertohit = ran.nextInt(6)+1;
            System.out.println("Defender roll:" + defendertohit);
            System.out.println("Should hit on a 2");
        if(hit(defendertohit,defender.getWeaponSkill(),attacker.getWeaponSkill())){
            System.out.println("Defender hit Attacker for "+defender.getDamage());
            attacker.setHp(attacker.getHp()-defender.getDamage());
            System.out.println("Attacker has "+attacker.getHp()+" HP Left");
           
        }else{
            System.out.println("Defender missed");
        }
        
        turn++;
        }
         
        
    }

    @Override
    public void Rolecommands(Enum role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortCombatents() {
        //build sort algorithm to sort by inite
    }

    @Override
    public boolean playerDefeated() {
        return !playerArray.isEmpty();
    }

    @Override
    public boolean monsterDefeated() {
        return !monsters.isEmpty();
    }
    
    boolean hit (int attackrole, int attackerWS,int defenderWS){
            int lowesthit = 1;
            int lowerhit = 2;
            int mediumhit = 3;
            int averagehit= 4;
            int highhit = 5;
            int higherhit = 6;
            int imposeru = 7;
            
        if(attackerWS==defenderWS){
            if(attackrole == averagehit)
            return true;
        }
        
        if(attackerWS > defenderWS){
            int difference = attackerWS-defenderWS;
            if(difference >= mediumhit && attackrole>=lowesthit){
                return true;
            }
            if(difference >= lowerhit && attackrole>=lowerhit){
                return true;
            }
            if(difference >=lowesthit && attackrole>=mediumhit){
                return true;
            }
        }
        
        if(attackerWS < defenderWS){
             int difference = defenderWS-attackerWS;
            if(difference >= mediumhit && attackrole>=imposeru){
                return true;
            }
            if(difference >= lowerhit && attackrole>=higherhit){
                return true;
            }
            if(difference >=lowesthit && attackrole>=highhit){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean fightActive() {    
        return characters.size() > 1;
    }
    
}
