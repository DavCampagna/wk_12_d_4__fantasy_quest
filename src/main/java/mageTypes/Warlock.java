package mageTypes;

import behaviours.ISpell;
import characters.Enemy;
import playerTypes.Mage;

public class Warlock extends Mage implements ISpell {
    public Warlock(String name) {
        super(name);
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
