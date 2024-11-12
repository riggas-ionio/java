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
    public void addTooth(){
        this.numTeeth ++;
    }
    public int getNumTeeth(){
        return this.numTeeth;
    }

    public static void main(String[] args) {
      // Create a new baby
      Baby george = new Baby("George", true);
      // Set/alter some attributes
      george.setWeight(3.420);
      george.addTooth();
      // Print baby data
      System.out.println(
             "New baby is " + george.getName()  +
             ", weight is " + george.getWeight() +
             ", has "+george.getNumTeeth()+" teeth.");
      // Prints:
      // New baby is George, weight is 3.420
   }
}
