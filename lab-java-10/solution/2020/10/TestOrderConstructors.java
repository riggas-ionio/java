import org.junit.*;
import static org.junit.Assert.*;

public class TestOrderConstructors {

    Order o;

    @Test(expected=IllegalArgumentException.class)
    public void testTwoArgConstr() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName()));
        o = new Order("Item X", -0.1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testThreeArgConstr() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName()));
        o = new Order("Item X", 5, -1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFourArgConstr() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName()));
        o = new Order("Item X", 5, 1, 5.0);
    }

    @Test
    public void testFourArgConstrCR() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName()));
        o = new Order("Item X", 5, 1, 0.5);
    }


}
