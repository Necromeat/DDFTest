/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddfinterfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Andrew
 */
public interface Roleofplayerinterface {
    
    List<Map> getClassSkills();
    List<Map> getNonClassSkills();
    List<Enum> usableEquipment();
    int getWSmod();
    int getHPmod();
    void updateSkills();
    void addSkill(String name, int amount);
    int getSkill(String name);
    boolean attemptSomethingUsingSkill(int dc, String Nameofskill);
    
}
