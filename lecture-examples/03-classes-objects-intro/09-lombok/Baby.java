import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(includeFieldNames=true)
public class Baby {
    @Getter
    private String name;
    @Getter @Setter
    private double weight = 4.0;
    @Getter
    private boolean isABoy;
    @Getter
    private int numTeeth = 0;

    public Baby(String name, boolean boy)
    {
        this.name = name;
        this.isABoy = boy;
    }

    public void addTooth () {
        this.numTeeth ++;
    }

    public static void main(String[] args) {
        Baby george1 = new Baby("George", true);
        george1.addTooth(); george1.addTooth(); george1.addTooth();
        System.out.println(george1);
    }
}
