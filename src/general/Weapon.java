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
public class Weapon extends Item{
    private Enum requiredSlot;
    private String name;
    private String description;
    private int value;
    private int damage;
    private int weaponskillmodifier=0;
    private Enum weaponType;
    private Enum equipmentType;
    
    
    public Weapon(){
    }

    public Weapon(String name, String description, int value, int damage,Enum requiredSlot ,Enum weaponType, Enum equipmentType) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.damage = damage;
        this.weaponType = weaponType;
        this.equipmentType = equipmentType;
        this.requiredSlot = requiredSlot;
    }

    public void setWeaponskillmodifier(int weaponskillmodifier) {
        this.weaponskillmodifier = weaponskillmodifier;
    }        
            

    @Override
    public String getName() {return name;}

    @Override
    public int getValue() {return value;}

    @Override
    public String getDescription() {return description;}

    public Enum getRequiredSlot() {
     
        return requiredSlot;
    }

    public int getDamage() {
        return damage;
    }

    public Enum getWeaponType() {
        return weaponType;
    }
    
    public int getWeaponSkillModifier(){
        return weaponskillmodifier;
    }
    
    @Override
    public Enum getItemType() {return equipmentType; }

    public void setRequiredSlot(Enum requiredSlot) {
        this.requiredSlot = requiredSlot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setWeaponType(Enum weaponType) {
        this.weaponType = weaponType;
    }

    public void setEquipmentType(Enum equipmentType) {
        this.equipmentType = equipmentType;
    }
    
    
    
    
}
