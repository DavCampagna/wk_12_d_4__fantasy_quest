package characters;

public class Player {

    String name;
    int HP;

    public Player(String name){
        this.name = name;
        this.HP = 100;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }
}
