import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test01Runner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Test01.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println("Test01.class was successful? "+result.wasSuccessful());
   }
}
