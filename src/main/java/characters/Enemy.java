package characters;

public class Enemy {

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
}
