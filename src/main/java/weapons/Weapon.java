package weapons;

public abstract class Weapon {

    private String weaponType;
    private int damageValue;

    public Weapon(String weaponType, int damageValue){
        this.weaponType = weaponType;
        this.damageValue = damageValue;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getDamageValue() {
        return damageValue;
    }

}
