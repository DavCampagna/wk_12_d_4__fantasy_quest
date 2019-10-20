import weapons.Sword;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SwordTest {
    Sword sword;
    Troll troll;

    @Before
    public void before(){
        sword = new Sword("JavaScript", 25);
        troll = new Troll("Benjamesh the Frustrated", 200);
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
        sword.attack(troll);
        assertEquals(175, troll.getHP());
    }


}
