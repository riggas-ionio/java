
public enum PaymentMethod{
    CASH(0.0, 0.0, 300.0),
    DEBIT(0.02, 1.0, 2000.0),
    CREDIT(0.015, 2.0, 2000.0),
    TRANSFER(0.0, 3.0, 10000.0);

    private final double commission_prc, commission_min, max_amount;
    PaymentMethod(double commission_prc, double commission_min, double max_amount){
        this.commission_prc = commission_prc;
        this.commission_min = commission_min;
        this.max_amount = max_amount;
    }

    public double calculateTransactionFee(double amount) {
        if (amount>this.max_amount){
            System.out.println("Payment amount exceeds maximum allowed for: "+this.toString());
            return amount;
        }
        double calcFee = amount * this.commission_prc;
        return Math.max(calcFee, this.commission_min);
    }
}
