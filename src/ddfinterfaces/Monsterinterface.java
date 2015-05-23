/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfinterfaces;

import general.Characterado;
import general.Item;
import java.util.List;

/**
 *
 * @author Andrew
 */
public interface Monsterinterface extends Characteradointerface {
    List<Item> getloot();
    Characterado getCharaterado();
    Enum getAggression();
    boolean rightlocation();
    
    
}
