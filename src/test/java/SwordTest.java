import weapons.Sword;
import characters.Enemy;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SwordTest {
    Sword sword;
    Enemy enemy;

    @Before
    public void before(){
        sword = new Sword("JavaScript", 25);
        enemy = new Enemy("Benjamesh the Frustrated", 200);
    }

    @Test
    public void hasWeaponType(){
        assertEquals("JavaScript", sword.getWeaponType());
    }

    @Test
    public void hasDamageValue(){
        assertEquals(25, sword.getDamageValue());
    }

    @Test
    public void canAttack(){
        assertEquals(25, sword.getDamageValue());
    }

}
