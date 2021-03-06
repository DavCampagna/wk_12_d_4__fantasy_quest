import enemyTypes.Orc;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {
    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Beatrice the Prude", 50);
    }

    @Test
    public void hasName(){
        assertEquals("Beatrice the Prude", orc.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(50, orc.getHP());
    }
}
