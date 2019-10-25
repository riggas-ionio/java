import java.util.Scanner;

public class TemperatureConverter {
  private int tempC;

  // Only default constructor, by compiler!!! (lazy approach)
  public void setCelcius(int t){
    if ( t>=-274 )    // Temp below 0oKelvin considered out of bounds.
      this.tempC = t;
    else
      System.out.println("Temp too cold!!!");
  }
  public int getCelcius() {
    return this.tempC;
  }
  public void setFahrenheit(int t){
    // int c = (int)((t-32)*(5.0/9));   // Double -> Int convert C -> F
    int c = (t-32)*5/9;   // Int convert (ignore decimal) C -> F
    this.setCelcius(c); // Reuse setCelcius in order to
                        // expoit -274 check
  }
  public int getFahrenheit() {
    int f = this.tempC*9/5 +32;
    return f;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Temperacture ").append(this.tempC).append("oC ")
      .append(this.getFahrenheit()).append("oF");
    return sb.toString();
  }

  public static void main(String[] args){
    int t =0;
    Scanner sc = new Scanner(System.in);
    TemperatureConverter tc = new TemperatureConverter();
    do {
      System.out.print("Type oF: ");
      t = sc.nextInt();
      tc.setFahrenheit(t);
      System.out.println(tc.toString());
    } while (t>=-274);
  }

}
