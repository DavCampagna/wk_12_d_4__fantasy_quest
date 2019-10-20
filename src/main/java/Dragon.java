import behaviours.IDefend;
import characters.Enemy;

public class Dragon implements IDefend {

    private String name;

    public Dragon(String name) {
        this.name = name;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(30);
    }
}
