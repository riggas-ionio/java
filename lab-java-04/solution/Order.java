public class Order {
    private String itemName;
    private double netValue;
    private int quantity = 1;   //Default value =1
    private double discount = 0.0;  //Default value 0%; could be omitted and assigned as default by compiler
    static double vat = 0.23;   //Not final, VAT changes frequently

    public Order(String name, double netPrice) { // Param names do not need to be same as data members
        this.itemName = name;
        if( netPrice>=0.0 )
            this.netValue = netPrice;
        else // for now print message; should throw exception
            System.out.println("Negative prices not accepted; usign default 0.0");
    }

    public Order(String name, double netPrice, int itemCount) {
        this(name, netPrice);   // Call 2 argument constructor; avoid code duplication, exploit working code
        if( itemCount>=0 )
            this.quantity = itemCount;
        else // for now print message; should throw exception
            System.out.println("Negative quantity not accepted; usign default 1");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ")
            .append("\n\tItem:\t\t").append(this.itemName)
            .append("\n\tNet value:\t").append(this.netValue)
            .append("\n\tQuantity:\t").append(this.quantity)
            .append("\n\tDiscount:\t").append(this.discount);
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println( new Order("Ideal Bike", 250.0) );
        System.out.println( new Order("Lambo", 250_000.0, 2) );
    }
}
