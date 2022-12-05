import java.nio.file.*;

public class FilesPaths{

    public static void main(String[] args) throws java.io.IOException{
        Path file = Paths.get("./file.txt");
        System.out.println(file);
        System.out.println(file.toAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.toAbsolutePath().getParent());
        System.out.println(file.getFileName());
        System.out.println(Files.size(file));
        System.out.println(new String(Files.readAllBytes(file), "UTF-8"));
        Path tmpFile = Files.createTempFile("java-lab-09", ".txt");
        Files.copy(file, tmpFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(tmpFile.getFileName());
        System.out.println(Files.size(tmpFile));
    }

}
