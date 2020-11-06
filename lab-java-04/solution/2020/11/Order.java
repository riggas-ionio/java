import java.util.Scanner;

public class Order {
    private String itemName;
    private double netValue;
    private int quantity =1;
    private double discount =0.0;

    private static double vat = 0.23;

    public Order(String name, double price){
        this.itemName = name;
        if ( price>=0.0 )
            this.netValue = price;
        // else throw exception...
    }
    public Order(String name, double price, int quantity){
        this(name, price);
        if ( quantity>0 )
            this.quantity = quantity;
        // else throw exception
    }
    public Order(String name, double price, int quantity, double discount){
        this(name, price, quantity);
        if ( discount>=0.0 && discount<=1.0 )
            this.discount = discount;
        // else throw exception
    }
    public double computeBill(){
        return this.netValue * this.quantity * (1+Order.vat) * (1-this.discount);
    }
    public String toString(){
        return "Order: "+this.quantity+"x "+this.itemName+" ("+this.netValue+")"
            + "[+VAT -Discount] = "+this.computeBill();
    }
    public boolean equals(Order other){
        return this.itemName.equals(other.itemName)
            && this.netValue == other.netValue;
    }

    public static void main(String[] args){
        // Order o1 = new Order("Ideal Bike", 250.0, 1, 0.10);
        // Order o2 = new Order("Espresso", 1.0, 1, 0.0);
        // System.out.println(o1.equals(o2));
        //
        // Order o3 = new Order("Espresso", 1.0, 2, 0.0);
        // System.out.println(o3.equals(o2));
        Scanner sc = new Scanner(System.in);

        System.out.print("Item name: ");
        String name = sc.nextLine();
        System.out.print("Item quantity: ");
        int qnty = sc.nextInt();
        System.out.print("Item price: ");
        double price = sc.nextDouble();
        System.out.print("Offer a discount? ");
        double discount = sc.nextDouble();

        Order o = new Order(name, price, qnty, discount);
        System.out.println(o);

    }




}
