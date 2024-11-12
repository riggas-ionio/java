import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class CopyBuffered {
    public static void main(String[] args) throws IOException {

        byte[] buffer = new byte[100*1024];

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(args[0]));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(args[1]))) {

            int numBytes;
            while ((numBytes = bis.read(buffer))!= -1)
            {
                bos.write(buffer);
            }
        }
        catch (java.io.FileNotFoundException fnfe){
            System.out.println("File not found: "+fnfe.getMessage());
        }
    }
}
