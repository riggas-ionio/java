import org.junit.*;
import static org.junit.Assert.*;

public class TestPMCash2 {

    PaymentMethod pm;

    @Before
    public void prepare(){
        pm = PaymentMethod.CASH;
        System.out.println("Run @Before "+pm);
    }

    @Test
    public void testCalcFee() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName())+" on "+pm);
        double amount;
        amount=0.01;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
        amount=1.00;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
        amount=10.00;
        // This will appear..
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.01, pm.calculateTransactionFee(amount), 0.005);
        amount=100.00;
        // ..but this will not. Onthe the first assert that fails will appear!
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 10000000.0, pm.calculateTransactionFee(amount), 0.005);
        amount=1000.00;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
    }
}
