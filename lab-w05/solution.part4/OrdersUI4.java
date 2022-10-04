import java.util.Scanner; 
import java.util.ArrayList;
import java.util.HashMap; 

public class OrdersUI4 {
    private HashMap<String, ArrayList<Order>> orders = new HashMap<String,ArrayList<Order>>();
    
    private boolean checkAndMerge(ArrayList<Order> ordersList, Order o){
        for(Order current: ordersList){
            if(current.equals(o)){
                System.out.println("Merge: \n\t"+current+"\n\t"+o);
                current.merge(o);
                return true;
            }
        }
        return false;
    }
    
    private void checkAndAdd(ArrayList<Order> ordersList, Order o){
        if ( checkAndMerge(ordersList, o) ) return;
        ordersList.add(o);
    }
    
    private void printAll(){
        for( String l: this.orders.keySet() ){
            System.out.println("Orders in list:"+l);
            int i=0;
            for(Order o: this.orders.get(l)){
                if( o==null ) break;
                System.out.println("\t"+l+(++i)+" "+o);
            }
        }
    }
    
    private void addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Item name? ");
        String name = sc.nextLine();
        System.out.print("Item price? [>0] ");
        double price = sc.nextDouble();
        System.out.print("Quantity? [>0] ");
        int quantity = sc.nextInt();
        System.out.print("Discount? [0.0 - 1.0] ");
        double discount = sc.nextDouble();  
        sc.nextLine();
            
        Order o = new Order(name, price, quantity, discount);
        System.out.print("Add to list:");
        String listName = sc.nextLine();
        this.checkAndAdd(orders.get(listName), o);
    }
    /*
    private void remove(){
        this.printAll();
        Scanner sc = new Scanner(System.in);
        System.out.print("Remove order # ");
        int index = sc.nextInt();
        sc.nextLine();
        this.orders.remove(index-1);
    }*/
    
    public static void main(String[] args){
        OrdersUI4 oui = new OrdersUI4();
        oui.orders.put("cart", new ArrayList<Order>());
        oui.orders.put("wish", new ArrayList<Order>());
        oui.orders.put("gift", new ArrayList<Order>());
        Scanner sc = new Scanner(System.in);
        String menuOption = "A"; // start by adding an order
        do {
            switch( menuOption ){
                case "A":
                    oui.addNew();
                    break;
                case "R":
                    //oui.remove(); // throws exception
                    break;
            }
            oui.printAll();
            
            System.out.println("Add another? Type 'A' ");
            System.out.println("Remove an order? Type 'R' ");
            System.out.println("Quit? Type 'Q' ");
            System.out.print("Type: ");
            menuOption = sc.nextLine();
            
        }while( ! menuOption.equalsIgnoreCase("Q") );        
    }
    
}