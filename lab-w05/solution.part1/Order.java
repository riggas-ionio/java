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
        return this.itemName +" "+this.netValue+" x"+this.quantity + " -"+(100*this.discount)+"%  =  "+this.computeBill();
    }
    
    public boolean equals(Order other){
        if ( other == null ) return false;
        return this.itemName.equals(other.itemName) && this.netValue == other.netValue;
    }
    
    public void merge(Order other){
        // check itemname, price
        if ( ! this.equals(other) ){
            System.out.println("Cannot merge different orders!");
            return;
        }
        this.quantity += other.quantity;
        this.discount = Math.max(this.discount, other.discount);
    }
    
    public static void main(String[] args){
        Order o1 = new Order("Bicycle", 100, 2, 0.15) ;
        Order o2 = new Order("Bicycle", 100, 5, 0.20) ;
        Order o3 = null; //caution: causes NullPointerException
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o2));
        
    }
}