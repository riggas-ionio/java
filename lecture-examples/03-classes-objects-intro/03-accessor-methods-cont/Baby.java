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
        if (weight>0.0)
            this.weight = weight;
    }

    public static void main(String[] args) {
      // Δημιουργούμε το μωρό
      Baby george = new Baby("George", true);

      george.setWeight(3.420);

      // Εμφανίζουμε το όνομά του
      System.out.println(
             "New baby is " + george.getName()  +
             ", weight is " + george.getWeight());
      // Θα εμφανίσει: 
      // New baby is George, weight is 3.420
   }
}




