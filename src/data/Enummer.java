/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Andrew
 */
public interface Enummer {
    enum alligenment{good,evil,neutral};
    enum Combat{hit,miss,critical,block};
    enum aggression{aggressive,passive,trusting};
    enum role{trader,quester,commoner,mayor};
    enum help{help_move,help_combat,help_basics,help;}
    enum attributes{Strength,Agility,Constituion,Intellegence,Wisdom,Charisma}
    enum Race{Human,Dwarf,Elf,Orc};
    enum Moves{North,South,East,West,up,down};
    enum Equipment{Simple,Martial,Excotic}
    
}
