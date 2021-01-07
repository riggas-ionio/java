import org.junit.*;
import static org.junit.Assert.*;

public class TestPMCash {

    PaymentMethod pm;

    @Before
    public void prepare(){
        pm = PaymentMethod.CASH;
        System.out.println("Run @Before "+pm);
    }

    @Test
    public void testOneCent() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName())+" on "+pm);
        double amount =0.1;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
    }

    @Test
    public void testOneEuro() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName())+" on "+pm);
        double amount =1.0;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
    }

    @Test
    public void testTenEuros() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName())+" on "+pm);
        double amount =10.0;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
    }

    @Test
    public void testHundredEuros() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName())+" on "+pm);
        double amount =100.0;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
    }

    @Test
    public void testThousandEuros() {
        System.out.println("Run @Test "+(new Throwable().getStackTrace()[0].getMethodName())+" on "+pm);
        double amount =1000.0;
        assertEquals("Error calculating transaction fee of "+amount+" euro for "+pm, 0.0, pm.calculateTransactionFee(amount), 0.005);
    }

}
