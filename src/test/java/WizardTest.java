import org.junit.Before;
import org.junit.Test;
import mageTypes.Wizard;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Jordan the Vaper");
    }

    @Test
    public void hasName(){
        assertEquals("Jordan the Vaper", wizard.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, wizard.getHP());
    }
}
