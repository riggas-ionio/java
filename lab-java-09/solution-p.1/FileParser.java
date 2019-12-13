import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileParser {

    public static int wordCount(String filename) throws IOException{
        int words = 0;
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(filename));
            String l;
            while ((l = inputStream.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(l, " ,.");
                words += st.countTokens();
            }
        } finally {
            if ( inputStream!=null )
                inputStream.close();
        }
        return words;
    }

    public static int lineCount(String filename) throws IOException{
        int lines = 0;
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(filename));
            String l;
            while ((l = inputStream.readLine()) != null) {
                lines++;
            }
        } finally {
            if ( inputStream!=null )
                inputStream.close();
        }
        return lines;
    }

    public static int letterCount(String filename) throws IOException{
        int letters = 0;
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(filename));
            String l;
            while ((l = inputStream.readLine()) != null) {
                l = l.toUpperCase();
                for ( int i=0; i<l.length(); i++) {
                    char c = l.charAt(i);
                    if ( c >= 'A' && c <= 'Z') {
                        letters++;
                    }
                }
            }
        } finally {
            if ( inputStream!=null )
                inputStream.close();
        }
        return letters;
    }

    public static void main(String[] args) throws IOException {
        if ( args.length < 2) {
            System.out.println("Usage: java FileParser -w <filename> \t\t#To count words" );
            System.out.println("Usage: java FileParser -ln <filename> \t\t#To count lines" );
            System.out.println("Usage: java FileParser -lt <filename> \t\t#To count letters" );    
            return;
        }
        if ( args[0].equals("-w") )
            System.out.println("Words: "+ wordCount( args[1] ) );
        else if ( args[0].equals("-ln") )
            System.out.println("Lines: "+ lineCount( args[1] ) );
        else if ( args[0].equals("-lt") )
            System.out.println("Letters: "+ letterCount( args[1] ) );
    }


}
