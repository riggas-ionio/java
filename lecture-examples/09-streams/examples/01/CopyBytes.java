import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);
            int c; // c is actually byte (8bit)

            while ((c = in.read()) != -1) {
                out.write(c);
            }
            // in.close();
            // out.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Αδυναμία ανάγνωσης αρχείου:"+args[0]);
        } catch (IOException e) {
            System.out.println("Σφάλμα εισόδου-εξόδου.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Δεν δόθηκαν αρκετές παράμετροι. "+e.getMessage());
        } finally {
            System.out.println("Cleaning up files streams.");
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
