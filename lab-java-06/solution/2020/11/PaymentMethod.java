
public enum PaymentMethod{
    CASH(0.0, 0.0, 300.0),
    DEBIT(0.02, 1.0, 2000.0),
    CREDIT(0.015, 2.0, 2000.0),
    TRANSFER(0.0, 3.0, 10000.0);

    private final double fee_prc, fee_min, max_amount;
    PaymentMethod(double prc, double fmin, double max){
        this.fee_prc = prc;
        this.fee_min = fmin;
        this.max_amount = max;
    }

    public double calculateTransactionFee(double amount){
        if ( amount>this.max_amount ){
            System.out.println("Maximum amount exceeded for "+this.toString());
            return amount;
        }
        double fee = amount * this.fee_prc;
        return Math.max(fee, this.fee_min);
    }
}
