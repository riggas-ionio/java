import java.util.Scanner;

public class TemperatureConverter{
    private int tempC; // temp in Celcius

    // No constructor = only default constructor by javac

    public void setCelcius(int c){
        this.tempC = c;
    }
    public void setFahrenheit(int f){
        this.tempC = (f-32)*5/9;
    }
    public int getCelcius(){
        return this.tempC;
    }
    public int getFahrenheit(){
        return this.tempC * 9/5 +32;
    }

    public String toString(){
        return "Temperature "+this.tempC+"oC "+this.getFahrenheit()+"oF ";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a temperature (int): ");
        int t = sc.nextInt();

        sc.nextLine(); // Consume \n from input stream
        System.out.print("Is "+t+" Celcius or Farherheit? (type: C or F): ");
        // Repeat until C of F... how?
        String s = sc.nextLine();
        TemperatureConverter tc = new TemperatureConverter();
        if ( s.equals("C"))
            tc.setCelcius(t);
        else
            tc.setFahrenheit(t);

        System.out.println(tc);
    }


}
