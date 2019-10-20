package weapons;

import behaviours.IWeapon;
import characters.Enemy;

public class Sword extends Weapon implements IWeapon {
    public Sword(String weaponType, int damageValue){
        super(weaponType, damageValue);}

    public void attack(Enemy enemy) {
        enemy.takeDamage(getDamageValue());
    }
}
