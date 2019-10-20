import weapons.Sword;
import heroTypes.SoftwareDeveloper;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SoftwareDeveloperTest {

    SoftwareDeveloper softwareDeveloper;
    Sword sword;

    @Before
    public void before(){
        sword = new Sword("JavaScript", 25);
        softwareDeveloper = new SoftwareDeveloper("Shona the Wise", sword);
    }

    @Test
    public void hasName(){
        assertEquals("Shona the Wise", softwareDeveloper.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, softwareDeveloper.getHP());
    }

    @Test
    public void hasWeapon() {
        Sword sword = (Sword) softwareDeveloper.getWeapon();
        assertEquals("JavaScript", sword.getWeaponType());}
}
