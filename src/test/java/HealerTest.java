import playerTypes.Healer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HealerTest {
    Healer healer;

    @Before
    public void before(){
        healer = new Healer("Lemsip the Soother");
    }

    @Test
    public void hasName(){
        assertEquals("Lemsip the Soother", healer.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, healer.getHP());
    }
}
