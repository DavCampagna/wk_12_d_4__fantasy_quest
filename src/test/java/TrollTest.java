import enemyTypes.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrollTest {
    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Trollolol", 80);
    }

    @Test
    public void hasName(){
        assertEquals("Trollolol", troll.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(80, troll.getHP());
    }
}
