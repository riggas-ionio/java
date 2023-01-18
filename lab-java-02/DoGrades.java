import java.util.Scanner;

public class DoGrades {
   public static void main(String[] args){
      
      System.out.print("Enter final class average: ");

      
      Scanner in = new Scanner(System.in);
      double average = in.nextDouble();

      String finalGrade=" ";

      if(average>=90.0 && average<=100.0){
        finalGrade="A";
      }
      else
      if(average>=80.0 && average<=90.0){
        finalGrade="B";
      }
      else 
      if(average>=70.0 && average<=80.0){
        finalGrade="C";
      }
      else 
      if(average>=60.0 && average<=70.0){
        finalGrade="D";
      }
      else 
      if(average>=0.0 && average<=60.0){
        finalGrade="F";
      }

      System.out.println(finalGrade);
   }
}

