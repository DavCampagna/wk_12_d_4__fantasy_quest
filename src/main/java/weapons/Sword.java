package weapons;

import behaviours.IWeapon;

public class Sword extends Weapon implements IWeapon {
    public Sword(String weaponType, int damageValue){
        super(weaponType, damageValue);}

    public int attack(){
        return getDamageValue();
    }
}
