import java.util.Scanner;

public enum Planets {
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a planet name: ");
        String s1 = sc.nextLine();
        Planets p1 = Planets.valueOf(s1.toUpperCase());
        // Planets p1 = Planets.valueOf(s1); //Non capital letter throw Exception
        System.out.println("Planet "+p1+" is the "+(p1.ordinal()+1)+" planet in our solar system");

        System.out.print("Type another planet name: ");
        String s2 = sc.nextLine();
        Planets p2 = Planets.valueOf(s2.toUpperCase());
        System.out.println("Planet "+p2+" is the "+(p2.ordinal()+1)+" planet in our solar system");

        if (p2.ordinal() < p1.ordinal()) {
            Planets p = p2;
            p2=p1; p1=p;
        }

        System.out.println(p1+" is closer to Sun than "+p2);
    }
}
