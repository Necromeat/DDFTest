/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfinterfaces;

import java.util.List;

/**
 *
 * @author Andrew
 */
public interface Raceinterface {
    String getRaceDiscription();
    Enum getRace();
    int getRaceStrMod();
    int getRaceAgiMod();
    int getRaceConMod();
    int getRaceIntMod();
    int getRaceWisMod();
    int getRaceCharMod();
    List<Enum> getAlligenments();
    List<Enum> getRacialEnemys();
    List<Enum> getEquipmentSlots();
}
