import heroTypes.Faun;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static junit.framework.TestCase.assertEquals;

public class FaunTest {
    Faun faun;
    Axe axe;

    @Before
    public void before(){
        axe = new Axe("Shredder", 30);
        faun = new Faun("Pan the pancake Eater", axe);
    }

    @Test
    public void hasName(){
        assertEquals("Pan the pancake Eater", faun.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, faun.getHP());
    }

    @Test
    public void hasWeapon(){
        Axe axe = (Axe) faun.getWeapon();
        assertEquals("Shredder", axe.getWeaponType());
    }
}
