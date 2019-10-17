import heroTypes.SoftwareDeveloper;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SoftwareDeveloperTest {

    SoftwareDeveloper softwareDeveloper;

    @Before
    public void before(){
        softwareDeveloper = new SoftwareDeveloper("Shona the Wise");
    }

    @Test
    public void hasName(){
        assertEquals("Shona the Wise", softwareDeveloper.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, softwareDeveloper.getHP());
    }
}
