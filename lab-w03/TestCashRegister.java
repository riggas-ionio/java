public class TestCashRegister{
    public static void main(String args[]){
        CashRegister cr = new CashRegister(0.1, 0.2);
        cr.addItem(1, false);
        System.out.println(cr);
        cr.addItem(0.50, true);
        System.out.println(cr);
        CashRegister cr2 = cr;
        cr2.clear();
        System.out.println(cr);        
    }
}
