public class DaysOfTheWeek{
    public static void main(String[] args){
        for ( Day d: Day.values() ) {
            System.out.println(d);
        }
        Day firstDayOfTheWeek = Day.MONDAY;
        System.out.println("The first day of the week is "+firstDayOfTheWeek);
    }
}
