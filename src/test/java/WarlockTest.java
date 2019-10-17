import org.junit.Before;
import org.junit.Test;
import mageTypes.Warlock;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
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
}
