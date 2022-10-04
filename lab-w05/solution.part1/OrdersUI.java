import java.util.Scanner; 

public class OrdersUI {
    private Order[] orders = new Order[10];
    
    private boolean checkAndMerge(Order o){
        for(Order other: orders){
            if ( other == null )
                return false;
            else if(other.equals(o)){
                System.out.println("Merge: \n\t"+other+"\n\t"+o);
                other.merge(o);
                return true;
            }
        }
        return false;
    }
    
    private void checkAndAdd(Order o){
        if ( checkAndMerge(o) ) return;
        for(int i=0; i<orders.length; i++){
            if ( orders[i]==null ){
                orders[i] = o;
                System.out.println("Order added at index: "+i+": "+o);
                return;
            }
        }
        System.out.println("Orders array already full!");
    }
    
    private void printAll(){
        System.out.println("Orders in list:");
        for(Order o: this.orders){
            if( o==null ) break;
            System.out.println("\t"+o);
        }
    }
    
    public static void main(String[] args){
        OrdersUI oui = new OrdersUI();
        Scanner sc = new Scanner(System.in);
        String menuOption = null;
        do {
            System.out.print("Item name? ");
            String name = sc.nextLine();
            System.out.print("Item price? [>0] ");
            double price = sc.nextDouble();
            System.out.print("Quantity? [>0] ");
            int quantity = sc.nextInt();
            System.out.print("Discount? [0.0 - 1.0] ");
            double discount = sc.nextDouble();  
            
            Order o = new Order(name, price, quantity, discount);
            oui.checkAndAdd(o);
            
            oui.printAll();
            
            sc.nextLine();
            System.out.print("Read another? Y/Q=quit: ");
            menuOption = sc.nextLine();
        }while( ! menuOption.equalsIgnoreCase("Q") );        
    }
    
}