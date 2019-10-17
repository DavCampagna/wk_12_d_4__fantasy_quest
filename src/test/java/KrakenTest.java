import enemyTypes.Kraken;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KrakenTest {

    Kraken kraken;

    @Before
    public void before(){
        kraken = new Kraken("Davide Jones", 250);
    }

    @Test
    public void hasName(){
        assertEquals("Davide Jones", kraken.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(250, kraken.getHP());
    }
}
