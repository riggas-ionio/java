import java.io.IOException;

public class TestEx{

    public static void main(String[] args){
        try{
            if (args.length==0){
                throw new IndexOutOfBoundsException("Too few arguments; usage: \njava TextEx 1");
            }
            else if (args[0].equals("2")) {
                System.out.println("Exit immediately :-/");
                System.exit(2);
            }
            throw new IOException();
        } catch(IOException e){
            System.out.println("Ooops... IOException");
        } finally {
            System.out.println("Finally :-)");
        }

    }

}
