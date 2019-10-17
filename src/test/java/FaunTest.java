import heroTypes.Faun;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FaunTest {
    Faun faun;

    @Before
    public void before(){
        faun = new Faun("Pancake");
    }

    @Test
    public void hasName(){
        assertEquals("Pancake", faun.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, faun.getHP());
    }
}
