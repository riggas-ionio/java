
public class Other {
    public static void main(String[] args){
        Baby george = new Baby("George", true);
        Baby nancy = new Baby("Nancy", false);

        //george.numTeeth = 3; // error: numTeeth has private access in Baby
        nancy.addTooth(); nancy.addTooth();
        george.removeOtherChildsTooth(nancy);

        System.out.println(
               "New baby is " + nancy.getName()  +
               ", weight is " + nancy.getWeight() +
               ", has "+nancy.getNumTeeth()+" teeth.");
    }
}
