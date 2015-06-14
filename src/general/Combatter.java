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
        }
        for (Object monsterer : monster){
            this.monsters.add((Monster)monsterer);
        }

        activePlayer = playerArray.get(0);
        activeMonster = monsters.get(0);
        
        while(!playerDefeated() && !monsterDefeated()){
            if(activePlayer.getWeaponSkill() > activeMonster.getWeaponSkill()){
                if(ran.nextInt(6)>= 3){
                    System.out.println("Hit");
                    int tempHp = activeMonster.getHp()-activePlayer.getDamage();
                    activeMonster.setHp(tempHp);
                    System.out.println("Monster has " + activeMonster.getHp()+"Left");
                }else{
                    System.out.println("Player missed.");
                }
            }
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
    
        return activePlayer.getHp() <= 0;
    }

    @Override
    public boolean monsterDefeated() {
        return activeMonster.getHp() <= 0;
    }
    
}
