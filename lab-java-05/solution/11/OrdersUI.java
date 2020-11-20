import java.util.Scanner;

public class OrdersUI {
    private final int LEN=2;
    private Order[] myOrders = new Order[LEN];

    public void menu(){
        System.out.println("Welcome to the best ordering system!!!");
        Scanner sc = new Scanner(System.in);
        char input = ' ';
        do {
            System.out.print("Menu \n"+
            "A to Add an order\nL to List orders\nR to Remove an order\nQ to Quit"+
            "Type A|L|R|Q: ");
            String s = sc.nextLine();
            input = s.length()>0 ? s.charAt(0) : ' ';  // (cond)?(if true):(if false)
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
                default:
                    System.out.println("Invalid option.");
            }
        } while (input!='Q');
    }

    public void add(){
        Scanner sc = new Scanner (System.in);
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
        System.out.println("Found? "+other);
        if( other==null ){
            // Alternative 1:
            int i;
            for(i=0; i<this.myOrders.length;i++){
                if( this.myOrders[i]==null ){
                    this.myOrders[i]=o;
                    break;//stop for
                }
            }
            if ( i<this.myOrders.length )
                System.out.println("Added at pos "+i+"; remaining "+(this.myOrders.length-i-1));
            else
                System.out.println("List already full.");

            // Alternative 2:
            // int i=0;
            // while(this.myOrders[i]!=null)
            //     i++
            // if ( i<this.myOrders.length-1 )
            //     this.myOrders=o;
        } else {
            other.setQuantity(other.getQuantity()+o.getQuantity());
            // o.setQuantity(other.getQuantity()+o.getQuantity());
            other.setDiscount(other.getDiscount()>o.getDiscount()?other.getDiscount():o.getDiscount());
            // o.setDiscount(other.getDiscount()>o.getDiscount()?other.getDiscount():o.getDiscount());

            System.out.println("Updated: "+other);
        }

    }

    private Order search(Order s){
        // for( int i=0; i<this.myOrders.length; i++){
        //     if ( s.equals(this.myOrders[i]) )
        //         return this.myOrders[i];
        // }
        for(Order o: this.myOrders){
            if ( s.equals(o) )
                return o;
        }
        return null;
    }

    public void list(){
        int i=1;
        for(Order o: this.myOrders){
            if ( o !=null )
                System.out.println("Order item "+(i++)+": "+ o);
            else
                break;
        }
        System.out.println("List items= "+(i-1));
    }

    public Order remove(){
        Scanner sc = new Scanner (System.in);
        int pos;
        do {
            System.out.print("Type the order index to remove: ");
            pos = sc.nextInt();
        } while( pos<1 || pos>this.myOrders.length);
        Order o = this.myOrders[pos-1];
        this.myOrders[pos-1]=null;
        if ( o==null ){
            System.out.println("Orders index empty: "+pos);
            return null;
        }
        for( int i=pos; i<=this.myOrders.length-1; i++){
            this.myOrders[pos-1]=this.myOrders[pos];
            this.myOrders[pos]=null;
        }
        return o;
    }

    public static void main(String[] args){
        OrdersUI ui = new OrdersUI();
        ui.menu();
    }

}
