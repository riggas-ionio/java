public class Order {
    private String itemName;
    private double netValue;
    private int quantity =1;
    private double discount =0.0;

    private static double vat = 0.23; //NB this is not final!!

    public Order(String name, double price){
        this.itemName = name;
        this.netValue = price;
    }
    public Order(String name2, double price, int quantity){
        this(name2, price); // Calling another constructor
        if (quantity>0 && quantity<=100) // New requirement; quantity =[1,100]
            this.quantity = quantity;
    }
    public Order(String name3, double price, int quantity, double discount){
        this(name3, price, quantity); // Calling another constructor
        if ( discount>=0.0 && discount<=1.0 ) //Checking input data
            this.discount = discount;
    }

    public double computeBill(){
        return this.quantity * this.netValue * (1+Order.vat) * (1-this.discount);
    }

    public String toString(){
        return "Order: "+this.itemName+" qnty="+this.quantity
            +" x net price="+this.netValue+" [+23%VAT - "
            +100*this.discount+"% Discount] ==payable== "+this.computeBill();
    //     return "Order %s qnty=%1$3d x net price=%2$5.2f [+23%VAT - %.2f Discount] ==payable== %5.2f"
    //         .format(this.itemName, this.netValue, 100*this.discount, this.computeBill());
    }

    public boolean equals(Order other){
        if (other==null) return false; // To avoid NullPointerException
        return this.itemName.equals(other.itemName)
            && this.netValue == other.netValue;
    }

    public static void main(String[] args){
        Order o1= new Order("Ideal bike", 300.0, 1, 0.10);
        Order o2 = new Order("Espresso", 1.0, 1, 0.0);
        System.out.println(o1.equals(o2));
        Order o3 = new Order("Espresso", 1.0, 2, 0.0);
        System.out.println(o3.equals(o2));
    }

}
