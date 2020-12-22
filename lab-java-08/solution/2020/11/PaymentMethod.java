
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

class TransactionFeeComparator implements java.util.Comparator<PaymentMethod>{
    double amount;
    public TransactionFeeComparator(double amount){
        this.amount=amount;
    }
    public int compare(PaymentMethod pm1, PaymentMethod pm2){
        double feeDiff = pm1.calculateTransactionFee(this.amount) - pm2.calculateTransactionFee(this.amount);
        // 2.00 - 2.005 = -0.005 <0.01 ~equal ==> 0
        // 2.00 - 1.95 = 0.05 >0.0 this is greater ==> 1
        // 1.95 - 2.00 = -0.05 <0.0 other is greater ==> -1
        if ( Math.abs(feeDiff) < 0.01 )
            return 0;
        else if ( feeDiff > 0.0 )
            return 1;
        else
            return -1;

    }
}
