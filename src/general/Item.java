/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

/**
 *
 * @author Andrew
 */
public abstract class Item {
    
    abstract public String getName();
    abstract public int getValue();
    abstract public String getDescription();
    abstract public Enum getItemType();
    
}
