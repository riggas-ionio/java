public class Order {
    private String itemName;
    private double netValue;
    private int quantity = 1;
    private double discount =0.0;
    public static final double VAT = 0.23;
    
    public Order(String name, double value){
        this.itemName = name;
        if ( value<0.0 ){
            System.out.println("Net value must be >=0.0 : "+ value);
            return;
        }
        this.netValue = value;
    }
    public Order(String name, double value, int quantity){
        this(name, value);
        if ( quantity<0 ){
            System.out.println("Quantity must be >=0 : "+ quantity);
            return;
        }
        this.quantity = quantity;
    }
    public Order(String name, double value, int quantity, double discount){
        this(name, value, quantity);
        if ( discount<0.0 || discount>1.0){
            System.out.println("Discount must be in range [0.0, 1.0] : "+ discount);
            return;
        }
        this.discount = discount;
    }
    
    public double computeBill(){
        return this.quantity * this.netValue * (1.0 + Order.VAT) * (1.0 - this.discount);
    }
    
    public String toString(){
        return this.itemName + " x"+this.quantity + " -"+(100*this.discount)+"%  =  "+this.computeBill();
    }
    
    public static void main(String[] args){
        System.out.println( new Order("Bicycle", 100, 2, 0.15) );
        System.out.println( new Order("Bicycle", 200, 5, 0.20) );
    }
}