/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfinterfaces;

import ddfplayer.Player;
import general.Monster;
import java.util.List;

/**
 *
 * @author Andrew
 * @param <E>
 * @param <B>
 * @param <C>
 */
public interface Combatinterface<E extends Player,B extends Monster,C> {
    void fight(List<E>players,List<B>Monster,List<C> NPC);
    void Rolecommands(Enum Role);
    void sortCombatents();
    boolean playerDefeated();
    boolean monsterDefeated();
    
    
    
}
