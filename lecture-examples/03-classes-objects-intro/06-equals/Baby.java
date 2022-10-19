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
        // Δημιουργούμε ένα μωρό με όνομα George
        Baby george1 = new Baby("George", true);

        // Συγκρίνουμε το όνομα με ένα άλλο String George
        System.out.println(george1.getName() == new String("George"));    
        System.out.println(george1.getName().equals( new String("George") ));    
        System.out.println(george1.getName() == "George");
        // Τι θα εμφανίσει;   
    }
}




