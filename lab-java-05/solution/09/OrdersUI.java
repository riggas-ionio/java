import java.util.Scanner;

public class OrdersUI {
    private final int LEN=2;
    private Order[] myOrders = new Order[LEN];
    private int position = 0;

    public void add() {
        if ( this.position>LEN-1 ){
            System.out.println("Orders list is full.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your order name: ");
        String n = sc.nextLine();
        System.out.print("Type the product's price value: ");
        double nv = sc.nextDouble();
        System.out.print("Type the product's quantity: ");
        int q = sc.nextInt();
        System.out.print("Type the product's discount: ");
        double d = sc.nextDouble();
        Order o = new Order(n, nv, q, d);
        Order other = this.search(o);
        System.out.println("Found "+other);
        if ( other==null) {
            System.out.println("Adding "+o);
            this.myOrders[this.position] = o;
            this.position++;
        }
        else {
            other.merge(o);
        }
        System.out.println("Remaining positions: "+(LEN-this.position));
    }

    private Order search(Order o){
        for( int i=0; i<this.myOrders.length; i++){
            if ( o.equals(this.myOrders[i]))
                return this.myOrders[i];
        }
        return null;
    }

    public void list(){
        int i = 1;
        for(Order o: this.myOrders){
            if ( o!=null ){
                System.out.println("List item "+ i + ": "+ o);
            } else {
                System.out.println("Orders list contains "+(i-1)+" items.");
                break;
            }
            i++;
        }
    }

    public Order remove(){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Type the item number to remove: ");
        // int i = sc.nextInt();
        // if ( i<0 || i>this.myOrders.length-1){
        //     System.out.println("Order index out of bounds: "+i);
        //     return null;
        // }
        int i;
        do {
            System.out.print("Type the item number to remove: ");
            i = sc.nextInt();
            if ( i<1 || i>this.myOrders.length){
                System.out.println("Order index out of bounds: "+i);
            }
        } while (i<1 || i>this.myOrders.length); //NB.: 1-based, not 0-based
        Order o = this.myOrders[i-1];
        if (o==null){
            System.out.println("Order does not exist at: "+i);
            return null;
        }
        this.myOrders[i-1]=null;
        for(int j=i; j<=this.myOrders.length-1; j++){
            this.myOrders[j-1] = this.myOrders[j];
            if (this.myOrders[j]==null){
                break;
            }
            this.myOrders[j] = null;
        }
        this.position--;
        return o;
    }

    public void menu() {
        System.out.println("Welcome to the super Orders system!!!");
        Scanner sc = new Scanner(System.in);
        char input;
        do {
            System.out.print("Menu (type):\n"+
                                "A to Add a new order\n"+
                                "L to List all orders\n"+
                                "R to Remove an order\n"+
                                "Q to Quit\n Type [A|L|R|Q] ");
            String s = sc.nextLine();
            if (s.length()>0){
                input = s.charAt(0);
            }
            else{
                input=' ';
            }
            switch (input){
                case 'A':
                    this.add();
                    break;
                case 'L':
                    this.list();
                    break;
                case 'R':
                    System.out.println("Removed: "+this.remove());
                    break;
            }

        } while (input!='Q');
        System.out.println("Goodbye, see u soon!!");
    }

    public static void main(String[] args){
        OrdersUI ui = new OrdersUI();
        ui.menu();

    }


}
