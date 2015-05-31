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
/**
 *
 * @author Andrew
 */
public class Combatter implements Combatinterface {
    private ArrayList<Player> playerArray = new ArrayList<>();
    private ArrayList<Monster> monsters = new ArrayList<>();
    private ArrayList<Characterado> characters = new ArrayList<>();

    public Combatter() {
    }  
    
    

    @Override
    public void fight(List players, List monster, List NPC) {
        for (Object player : players) {
            this.playerArray.add((Player) player);
        }
        for (Object monsterer : monster){
            this.monsters.add((Monster)monsterer);
        }

        int wsp = playerArray.get(0).getWeaponSkill();
        int wsm = monsters.get(0).getWeaponSkill();
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean monsetDefeated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
