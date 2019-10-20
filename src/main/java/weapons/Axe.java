package weapons;

import behaviours.IWeapon;
import characters.Enemy;

public class Axe extends Weapon implements IWeapon {
    public Axe(String weaponType, int damageValue){
        super(weaponType, damageValue);}

    public void attack(Enemy enemy) {
        enemy.takeDamage(getDamageValue());
    }

}
