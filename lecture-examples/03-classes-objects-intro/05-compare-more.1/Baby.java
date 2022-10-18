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
        // Δημιουργούμε το πρώτο μωρό
        Baby george1 = new Baby("George", true);
        // Δημιουργούμε το δεύτερο μωρό
        Baby george2 = new Baby("George", true);
        
        Baby george3 = george1;

        double w1 = 4.300;
        double w2 = w1;
        w2 = 3.600;
        
        george1.setWeight(w1);
        george2.setWeight(w2);
        george3.setWeight(4.550);

        System.out.println(
             "Baby 1 is " + george1.getName()  +
             ", weight is " + george1.getWeight());
             
        george3 = george2;
        george3.setWeight(6.300);
             
        System.out.println(
             "Baby 2 is " + george2.getName()  +
             ", weight is " + george2.getWeight());
             
      
    }
}




