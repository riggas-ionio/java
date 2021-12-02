import java.util.Scanner;
import java.util.ArrayList;

public class OrdersUI3 {
    private ArrayList<Order> orders = new ArrayList<Order>();

    private boolean checkAndMerge(Order o){
        for(Order current: orders){
            if(current.equals(o)){
                System.out.println("Merge: \n\t"+current+"\n\t"+o);
                current.merge(o);
                return true;
            }
        }
        return false;
    }

    private void checkAndAdd(Order o){
        if ( checkAndMerge(o) ) return;
        this.orders.add(o);
    }

    private void printAll(){
        System.out.println("Orders in list:");
        int i=0;
        for(Order o: this.orders){
            if( o==null ) break;
            System.out.println("\t"+(++i)+" "+o);
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
        this.checkAndAdd(o);
    }

    private void remove(){
        this.printAll();
        Scanner sc = new Scanner(System.in);
        System.out.print("Remove order # ");
        int index = sc.nextInt();
        sc.nextLine();
        this.orders.remove(index-1);
    }

    public static void main(String[] args){
        OrdersUI3 oui = new OrdersUI3();
        Scanner sc = new Scanner(System.in);
        String menuOption = "A"; // start by adding an order
        do {
            switch( menuOption ){
                case "A":
                    oui.addNew();
                    break;
                case "R":
                    oui.remove(); // throws exception
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
