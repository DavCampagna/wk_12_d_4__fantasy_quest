import enemies.Troll;
import org.junit.Rule;
import weapons.Axe;
import weapons.Sword;
import heroTypes.SoftwareDeveloper;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SoftwareDeveloperTest {

    SoftwareDeveloper softwareDeveloper;
    Sword sword;
    Axe axe;
    Troll troll;

    @Before
    public void before(){
        sword = new Sword("JavaScript", 25);
        axe = new Axe("Shredder", 30);
        troll = new Troll("Benjamesh the Frustrated", 200);
        softwareDeveloper = new SoftwareDeveloper("Shona the Wise", sword);
    }

    @Test
    public void hasName(){
        assertEquals("Shona the Wise", softwareDeveloper.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, softwareDeveloper.getHP());
    }

    @Test
    public void hasWeapon() {
        Sword sword = (Sword) softwareDeveloper.getWeapon();
        assertEquals("JavaScript", sword.getWeaponType());}

    @Test
    public void canChangeWeapon() {
        softwareDeveloper.changeWeapon(axe);
        assertEquals(axe, softwareDeveloper.getWeapon());
    }

    @Test
    public void canAttackEnemyWithWeapon(){
        softwareDeveloper.attack(troll);
        assertEquals(175, troll.getHP());
    }
}
