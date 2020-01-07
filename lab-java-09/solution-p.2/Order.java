import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.net.*;


enum PaymentMethod {
    DEBITCARD(0.02, 1.00, 2000.00),
    CREDITCARD(0.015, 2.00, 2000.00),
    BANKTRANSFER(0.00, 3.00, 10000.00),
    CASH(0.00, 0.00, 300.00);

    public final double transactionFeePrc;
    public final double transactionFeeMin;
    public final double transactionMaxAmount;
    PaymentMethod(double feePercentage, double feeMinimum, double maxAmount){
        this.transactionFeePrc = feePercentage;
        this.transactionFeeMin = feeMinimum;
        this.transactionMaxAmount = maxAmount;
    }
    double calculateTransactionFee(double amount){
        if ( amount>this.transactionMaxAmount ){
            System.out.println("Transaction not allowed by "+ this);
            return amount;
        }
        return Math.max(this.transactionFeeMin, amount * this.transactionFeePrc);
    }
}

public class Order implements Comparable<Order>{
    private String itemName;
    private double netValue;
    private int quantity = 1;   //Default value =1
    private double discount = 0.0;  //Default value 0%; could be omitted and assigned as default by compiler
    static double vat = 0.23;   //Not final, VAT changes frequently

    public Order(String name, double netPrice) throws IllegalArgumentException { // Param names do not need to be same as data members
        this.itemName = name;
        if( netPrice<0.0 )
          throw new IllegalArgumentException("Negative prices not accepted.");
        this.netValue = netPrice;
    }

    public Order(String name, double netPrice, int itemCount) throws IllegalArgumentException {
        this(name, netPrice);   // Call 2 argument constructor; avoid throws IllegalArgumentException code duplication, exploit working code
        if( itemCount<0 )
            throw new IllegalArgumentException("Negative quantity not accepted.");
        this.quantity = itemCount;
    }

    public Order(String name, double netPrice, int itemCount, double discount) throws IllegalArgumentException {
        this(name, netPrice, itemCount);   // Call 3 argument constructor; avoid code duplication, exploit working code
        if( discount<0.0 )
            throw new IllegalArgumentException("Negative discount not accepted.");
        if( discount>1.0 )
            discount = discount/100.0;
        this.discount = discount;
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

    public int compareTo(Order other) {
        if ( other == null ) return 1;
        return (new Double(this.computeBill())).compareTo( other.computeBill() );
    }

    public double computeBill() {
        return (this.netValue * this.quantity) * (1.0 - this.discount) * (1.0+Order.vat);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* String it = sc.        else // for now print message; should throw exception
            System.out.println("; usign default 0.0");
nextLine();
        System.out.println( (new Order(it, 250.0)).equals(new Order("Ideal Bike", 250.0)) );
        System.out.println( (new Order("Ideal Bike", 250.0)).equals(new Order("Ideal Bike", 150.0)) );
        System.out.println( new Order("Lambo", 250_000.0, 2) );
        */
        Set<Order> orders = new TreeSet<Order>();
        boolean hasNext =true;
        do {
            Order newO = null;
            try {
                System.out.print("Item name? ");
                String itemName = sc.nextLine();
                System.out.print("Item net value? ");
                double netValue = sc.nextDouble();
                System.out.print("Item quantity? ");
                int quantity = sc.nextInt();
                System.out.print("Item discount? ");
                double discount = sc.nextDouble();
                newO = new Order(itemName, netValue, quantity, discount);
              } catch (IllegalArgumentException ex) {
                  System.out.println(ex.getMessage());
                  continue;
              } catch (InputMismatchException ex) {
                  System.out.println("Input mismatch; try again.");
                  continue;
              }
              finally {
                  sc.nextLine(); // consume \n in input stream
              }
              Order o = null;

            Iterator<Order> iterator = orders.iterator();
            while( iterator.hasNext() ){
                o = iterator.next(); //Get a reference, i.e synonim
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
            hasNext = sc.nextBoolean(); //NB.: This is still unprotected;
                                        // Do handle exception!!
          sc.nextLine(); // consume \n in input stream
        }
        while ( hasNext );

        System.out.println( orders );

        double orderSum = 0.0;
        for (Order o: orders) {
            orderSum += o.computeBill();
        }
        System.out.println("Total due: "+ orderSum );
        Map<Double, PaymentMethod> paymentOptions = new TreeMap<Double, PaymentMethod>();
        for (PaymentMethod pm: PaymentMethod.values()) {
            if ( pm.transactionMaxAmount>= orderSum ) {
                double fee = pm.calculateTransactionFee(orderSum);
                if ( fee<(orderSum/(1+Order.vat)) )
                    paymentOptions.put(fee, pm);    // N.B.: What if two payment options have the same fee?
                                                    // Can you improve? Use a different Collection? Nest another collection in Map?
            }
        }
        System.out.println("Payment options:\n");
        for (Map.Entry<Double, PaymentMethod> entry : paymentOptions.entrySet()) {
            System.out.println(entry.getValue()+"\t\t"+entry.getKey());
        }

        Gson gson = new GsonBuilder().create();
        String jsonStr = gson.toJson(orders);

        System.out.println("Order as JSON: "+jsonStr);
        System.out.print("Post to server (IP/Hostname)? ");
        String hostName = sc.nextLine();
        System.out.print("Post to port (int)? ");
        int port = sc.nextInt();
        try {
          SocketClient.send(hostName, port, jsonStr);
        }catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
        }

    }
}
