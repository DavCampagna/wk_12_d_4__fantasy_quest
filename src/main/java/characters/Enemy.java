package characters;

public abstract class Enemy {

    String name;
    int HP;

    public Enemy(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void takeDamage(int damageValue) {
        this.HP = this.HP - damageValue;
    }
}
