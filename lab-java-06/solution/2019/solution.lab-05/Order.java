import java.util.*;

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

    public Order(String name, double netPrice, int itemCount, double discount) {
        this(name, netPrice, itemCount);   // Call 3 argument constructor; avoid code duplication, exploit working code
        if( discount>=0.0 )
            this.discount = discount;
        else // for now print message; should throw exception
            System.out.println("Negative discount not accepted; usign default 0.0");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ")
            .append("\n\tItem:\t\t").append(this.itemName)
            .append("\n\tNet value:\t").append(this.netValue)
            .append("\n\tQuantity:\t").append(this.quantity)
            .append("\n\tDiscount:\t").append(this.discount).append("\n");
        return sb.toString();
    }

    public boolean equals(Order other) {
        if ( other == null ) return false;
        return (this.itemName.equals(other.itemName)) // compare String values (equal value)
        // return (this.itemName==other.itemName)     // compare String references (same object)
                && (this.netValue==other.netValue);
    }

    public double computeBill() {
        return (this.netValue * this.quantity) * (1.0 - this.discount) * (1.0+Order.vat);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* String it = sc.nextLine();
        System.out.println( (new Order(it, 250.0)).equals(new Order("Ideal Bike", 250.0)) );
        System.out.println( (new Order("Ideal Bike", 250.0)).equals(new Order("Ideal Bike", 150.0)) );
        System.out.println( new Order("Lambo", 250_000.0, 2) );
        */
        List<Order> orders = new ArrayList<Order>();
        boolean hasNext =true;
        do {
            System.out.print("Item name? ");
            String itemName = sc.nextLine();
            System.out.print("Item net value? ");
            double netValue = sc.nextDouble();
            System.out.print("Item quantity? ");
            int quantity = sc.nextInt();
            System.out.print("Item discount? ");
            double discount = sc.nextDouble();
            Order newO = new Order(itemName, netValue, quantity, discount);
            Order o = null;
            for( int i=0; i<orders.size();i++){
                o = orders.get(i); //Get a reference, i.e synonim
                if ( o.equals( newO )) {
                    break;    // Keep reference, stop loop; i.e. found it!
                } else {
                  o = null;   // Reset reference; i.e. found it = false
                }
            }
            if ( o != null) {  // If reference !=null, i.e. found it, then merge orders
                o.quantity+= newO.quantity;
                o.discount = (o.discount>newO.discount) ? o.discount : newO.discount;
            } else {
                orders.add(newO);
            }
            System.out.print("More Items? (true/false) ");
            hasNext = sc.nextBoolean();
          sc.nextLine(); // consume \n in input stream
        }
        while ( hasNext );
        System.out.println( orders );
    }
}
