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
    public boolean getIsABoy() {
        return this.isABoy;
    }
    public double getWeight () {
        return this.weight;
    }
    public void setWeight (double weight) {
        this.weight = weight;
    }
    public int getNumTeeth () {
        return this.numTeeth;
    }
    public void addTooth () {
        this.numTeeth ++;
    }

    public String toString() {
        return "Baby is named "+this.name 
                +" is " + (this.isABoy?"a boy":"a girl")
                +" weights " +this.weight
                +" and has " +this.numTeeth +" teeth";
    }
    public static void main(String[] args) {
        // Δημιουργούμε ένα μωρό με όνομα George
        Baby george1 = new Baby("George", true);
        george1.addTooth(); george1.addTooth(); george1.addTooth();

        // Εκτυπώνουμε με χρήση μεθόδων πρόσβασης 
        System.out.println("Baby is named "+george1.getName() 
                            +" is " + ((george1.getIsABoy())?"a boy":"a girl")
                            +" weights " +george1.getWeight()
                            +" and has " +george1.getNumTeeth() +" teeth"
        );    
        // Τι θα εμφανίσει;
        
        // Δημιουργούμε ένα άλλο μωρό με όνομα Nancy
        Baby nancy = new Baby("Nancy", false);
        nancy.setWeight(3.200);
        nancy.addTooth(); nancy.addTooth();
        // Εκτυπώνουμε με χρήση μεθόδων πρόσβασης 
        System.out.println( nancy );
        // Baby nancy2 = new Baby("Nancy2", false);
        // System.out.println( nancy2 );
        // Τι θα εμφανίσει;
        
        Baby dimitris = new Baby("Dimitrios", true);
        System.out.println( dimitris );
        
    }
}




