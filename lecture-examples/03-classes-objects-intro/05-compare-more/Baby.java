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

    public boolean equals(Baby other){
        return this.name == other.name;
    }

    public static void main(String[] args) {
        // Δημιουργούμε το πρώτο μωρό
        Baby george1 = new Baby("George", true);
        // Δημιουργούμε το δεύτερο μωρό
        Baby george2 = new Baby("George", true);
        
        Baby george3 = george1;

        
      // Συγκρίνουμε τα δυο αντικείμενα
      System.out.println(george1 == george2);
      // Συγκρίνουμε τα δυο αντικείμενα
      System.out.println(george1 == george3);
      // Τι θα εμφανίσει;
      // Συγκρίνουμε τα δυο αντικείμενα
      System.out.println(george1.equals(george2));
      
    }
}




