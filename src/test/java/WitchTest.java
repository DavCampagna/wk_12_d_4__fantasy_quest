import org.junit.Before;
import org.junit.Test;
import healerTypes.Witch;

import static junit.framework.TestCase.assertEquals;

public class WitchTest {

    Witch witch;

    @Before
    public void before(){
        witch = new Witch("Amanda the Irish");
    }

    @Test
    public void hasName(){
        assertEquals("Amanda the Irish", witch.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, witch.getHP());
    }
}
