import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import mageTypes.Warlock;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Benjamesh the Frustrated", 200);
        warlock = new Warlock("Alex the IntelliJ");
    }

    @Test
    public void hasName(){
        assertEquals("Alex the IntelliJ", warlock.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, warlock.getHP());
    }

    @Test
    public void canAttackEnemy(){
        warlock.cast(troll);
        assertEquals(150, troll.getHP());
    }
}
