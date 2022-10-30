public class Baby {
    private String name;
    private double weight = 4.0;
    private boolean isABoy;
    private int numTeeth = 0;
    
    private static int babies = 0;
    
    public Baby(String name, boolean boy) 
    {
        this.name = name;
        this.isABoy = boy;
        babies++;
    }   

    public Baby(String name, boolean boy, double weight) 
    {
        this(name, boy);
        this.weight = weight;
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
    
    public static int getNumberOfBabies() {
        return Baby.babies;
    }
    
    protected void finalize() {
        babies--;
    }

    public static void main(String[] args) {
        // Δημιουργούμε το μωρό
        // Baby george = new Baby("George", true);
        System.out.println("Babies? "+Baby.getNumberOfBabies());
        for (int i=0; i<1000000; i++) new Baby("George", true);
        System.out.println("Babies? "+Baby.getNumberOfBabies());
        /*
        // Εμφανίζουμε το όνομά του
        System.out.println("Baby #"+Baby.getNumberOfBabies()+" is "
                            +george.getName());
        // Θα εμφανίσει: #1 George
        
        Baby nancy = new Baby("Nancy", false);
        // Εμφανίζουμε το όνομά του
        System.out.println("Baby #"+Baby.getNumberOfBabies()+" is "
                            +nancy.getName());
                            
        new Baby("Tom", true);
        new Baby("Steve", true, 3.86);
        System.out.println("Total # of babies so far: "+Baby.getNumberOfBabies());
        */
   }
}




