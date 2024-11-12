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
        StringBuilder sb = new StringBuilder();
        sb.append("Baby is named ").append(this.name)
          .append(" is ").append( this.isABoy?"a boy":"a girl" )
          .append(" weights ").append(this.weight)
          .append(" and has ").append(this.numTeeth).append(" teeth");
        return sb.toString();
    }
    public static void main(String[] args) {
        // Δημιουργούμε ένα μωρό με όνομα George
        Baby george1 = new Baby("George", true);
        george1.addTooth(); george1.addTooth(); george1.addTooth();
        System.out.println( george1 );
    }
}
