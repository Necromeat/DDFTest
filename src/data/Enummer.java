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
    enum attributes{strength,agility,constituion,intellegence,wisdom,charisma}
    enum Race{human,dwarf,elf,orc};
    enum Moves{north,south,east,west,up,down};
    enum Equipment{simple,martial,excotic,weapon,armour,shield,helmet,boots,ring}
    enum SlotFiller{onehand,twohand}
    enum Slots{head,torsoe,leg,foot,finger,hand,arm}
    
}
