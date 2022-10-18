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
    public void removeOtherChildsTooth(Baby other){
        other.numTeeth--;
    }

    public static void main(String[] args) {
      // Create a new baby
      Baby george = new Baby("George", true);
      george.numTeeth = 3;
   }
}