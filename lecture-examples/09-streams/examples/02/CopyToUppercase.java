import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyToUppercase {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(args[0]);
            outputStream = new FileWriter(args[1]);

            int c;  // c is now 16bit
            while ((c = inputStream.read()) != -1) {
                char[] ch =Character.toChars(c);
                outputStream.write(Character.toUpperCase(ch[0]));
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}