import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestPMCash2.class);

      System.out.println("\nFailures: ");
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println("\nWas test successful? "+result.wasSuccessful());
   }
}
