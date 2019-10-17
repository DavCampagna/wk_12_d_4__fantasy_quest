import playerTypes.Hero;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HeroTest {
    Hero hero;

    @Before
    public void before(){
        hero = new Hero("Joe the Resourceful");
    }

    @Test
    public void hasName(){
        assertEquals("Joe the Resourceful", hero.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, hero.getHP());
    }
}
