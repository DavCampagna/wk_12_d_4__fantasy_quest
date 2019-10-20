package playerTypes;

import behaviours.IWeapon;
import characters.Player;

public abstract class Hero extends Player {

    public IWeapon weapon;

    public Hero(String name, IWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }
}
