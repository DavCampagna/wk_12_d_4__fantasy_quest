import heroTypes.Faun;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FaunTest {
    Faun faun;

    @Before
    public void before(){
        faun = new Faun("Pan the pancake Eater");
    }

    @Test
    public void hasName(){
        assertEquals("Pan the pancake Eater", faun.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, faun.getHP());
    }
}
