import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class CopyBuffered {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        BufferedInputStream bis = null;
        FileOutputStream out = null;
        BufferedOutputStream bos = null;
        
        byte[] buffer = new byte[100*1024];
        
        try {
            in = new FileInputStream(args[0]);
            bis = new BufferedInputStream(in);
            out = new FileOutputStream(args[1]);
            bos = new BufferedOutputStream(out);
    
            int numBytes;
            while ((numBytes = bis.read(buffer))!= -1)
            {
                bos.write(buffer);
            }

        } finally {
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
    }
}