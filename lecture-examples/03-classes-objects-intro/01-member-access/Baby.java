public class Baby {
    String name;
    double weight = 4.0;
    boolean isABoy;
    int numTeeth = 0;
    
    public Baby(String name, boolean boy) 
    {
        this.name = name;
        this.isABoy = boy;
    }   

    public static void main(String[] args) {
        // Δημιουργούμε το μωρό
        Baby george = new Baby("George", true);
        
        // Εμφανίζουμε το όνομά του
        System.out.println("New baby is "+george.name);
        // Θα εμφανίσει: George
        
        // Αλλάζουμε το όνομά του
        george.name = "Nancy"; //το θέλουμε αυτό;
        
        // Εμφανίζουμε το τροποποιημένο όνομά του
        System.out.println("New baby is "+george.name);   
        // Θα εμφανίσει: Nancy        
    }
}




