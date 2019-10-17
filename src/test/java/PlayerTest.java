import characters.Player;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Michael", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Michael", player.getName());
    }
    
    @Test
    public void hasHP(){
        assertEquals(100, player.getHP());
    }
}
