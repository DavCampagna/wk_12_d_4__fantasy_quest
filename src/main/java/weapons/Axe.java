package weapons;

import behaviours.IWeapon;

public class Axe extends Weapon implements IWeapon {
    public Axe(String weaponType, int damageValue){
        super(weaponType, damageValue);}

    public int attack() {
        return getDamageValue();
    }
}
