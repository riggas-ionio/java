import java.util.Scanner;

public class TemperatureConverter{
    private int celcius;

    // No constructor = default constructor by compiler

    public void setCelcius(int c){
        this.celcius = c;
    }
    public void setFahrenheit(int f){
        this.celcius = (f-32)*5/9;
    }
    public int getCelcius(){
        return this.celcius;
    }
    public int getFahrenheit(){
        return this.celcius*9/5+32;
    }

    public String toString(){
        return "Temperature "+this.getCelcius()+"oC "+this.getFahrenheit()+"oF";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a temperature: ");
        int t = sc.nextInt();

        sc.nextLine(); // Consume Enter in input stream
        // Wrap in repeat until C or F..
        String s; // Do not declare s in block!!!!
        do {
            System.out.print("Is "+t+" Celcius or Fahrenheit? (type C or F): ");
            s = sc.nextLine();
        } while ( !s.equals("C") && !s.equals("F"));

        TemperatureConverter tc = new TemperatureConverter();

        if ( s.equals("C") )
            tc.setCelcius(t);
        else
            tc.setFahrenheit(t);

        System.out.println( tc );
    }
}
