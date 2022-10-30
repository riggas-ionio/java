
public class ScopeError{
    public static void main(String[] args){
        int n = 10;
        double sum = 0.0;
        for (int i=0; i<n; i++){
            double n = Math.sqrt(i); //ERROR: variable n is already defined in method main(String[])
            sum += n;
        }
    }
}
