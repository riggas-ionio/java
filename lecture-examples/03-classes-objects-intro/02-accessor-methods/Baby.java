public class Baby {
    private String name;
    private double weight = 4.0;
    private boolean isABoy;
    private int numTeeth = 0;
    
    public Baby(String name, boolean boy) 
    {
        this.name = name;
        this.isABoy = boy;
    }   

    public String getName() {
        return this.name;
    }
    public double getWeight () {
        return this.weight;
    }
    public void setWeight (double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        // Δημιουργούμε το μωρό
        Baby george = new Baby("George", true);
        
        // Εμφανίζουμε το όνομά του
        System.out.println("New baby is "
                            +george.getName());
        // Θα εμφανίσει: George
   }
}




