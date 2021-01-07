import org.junit.*;
import static org.junit.Assert.*;

public class TestOrderConstructors {

    Order o;

    @Test(expected=IllegalArgumentException.class)
    public void testTwoArgConstr() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName()));
        o = new Order("Item X", -0.1);
    }


}
