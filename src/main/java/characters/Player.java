package characters;

public class Player {

    String name;
    int HP;

    public Player(String name, int HP){
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
