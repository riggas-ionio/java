/**
Adapted from wiley.com/go/bjlo2code, chapter 8, sec. 8.
*/

public class CashRegister {
    private double totalPrice;
    private int lowTaxItemCount, highTaxItemCount;
    private double lowTaxRate, highTaxRate;

    /**
       Constructs a cash register with cleared item count and total.
       @param lowTaxRate the low tax rate to use with this cash register.
       @param highTaxRate the high tax rate to use with this cash register.
    */
    public CashRegister(double lowTaxRate, double highTaxRate) {
        if( lowTaxRate<0.0 || lowTaxRate>1.0
            || highTaxRate<0.0 || highTaxRate>1.0 ) {
                System.out.println("Tax rates must be between 0.0  and 1.0.");
                return;
            }
        if ( lowTaxRate>highTaxRate ) {
            System.out.println("Low tax rates must be lower than hight tax rate.");
            return;
        }
        this.lowTaxRate = lowTaxRate;
        this.highTaxRate = highTaxRate;
    }

    /**
       Adds an item to this cash register.
       @param price the price of this item
       @param highTaxRatable true if this item belongs to the high tax rate
    */
    public void addItem(double price, boolean highTaxRatable) {
        if (price <=0){
            System.out.format("Price (%.2f) must be >0%n", price);
            return;
        }
        if ( !highTaxRatable )
            this.lowTaxItemCount++;
        else
            this.highTaxItemCount++;
        this.totalPrice = this.totalPrice + price * (1.0+((highTaxRatable)?highTaxRate:lowTaxRate));
    }

    /**
       Gets the price of all items in the current sale.
       @return the total amount
    */
    public double getTotal() {
        return this.totalPrice;
    }

    /**
       Gets the number of items in the current sale.
       @return the item count
    */
    public int getCount() {
        return this.lowTaxItemCount + this.highTaxItemCount;
    }

    /**
       Clears the item count and the total.
    */
    public void clear() {
        this.lowTaxItemCount = 0;
        this.highTaxItemCount = 0;
        this.totalPrice = 0;
    }

    public String toString(){
        return String.format("Current total is %.2f (%d items)", this.getTotal(), this.getCount());
    }
}
