import healerTypes.Babooshka;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabooshkaTest {
    Babooshka babooshka;

    @Before
    public void before() {
        babooshka = new Babooshka("Karolina the Bat Man");
    }

    @Test
    public void hasName(){
        assertEquals("Karolina the Bat Man", babooshka.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, babooshka.getHP());
    }
}
