import java.util.Arrays;
public class StackAndHeap {
    
    public static void accumulate(int p1, int p2) {
        System.out.println("Entering accumulate(): p1= "+ p1 +", p2= " +p2);
        p1 = p1 + p2;
        System.out.println("Exiting accumulate():  p1= "+ p1 +", p2= " +p2);
    }
    
    public static void sum(int[] arrayParam) {
        System.out.println("Entering sum(): arrayParam= "+ Arrays.toString(arrayParam));
        System.out.println("Entering sum(): arrayParam= "+ arrayParam);
        for ( int i=0; i<arrayParam.length; i++) {
            int value = arrayParam[i];
            arrayParam[i]=0;
            arrayParam[0] += value;
        }
        System.out.println("Exiting sum(): arrayParam= "+ Arrays.toString(arrayParam));
    }
    
    public static void createNewArray(int[] arrayParam) {
        System.out.println("Entering createNewArray(): arrayParam= "+ Arrays.toString(arrayParam));
        System.out.println("Entering createNewArray(): arrayParam= "+ arrayParam);
        // arrayParam = new int[5]; // NB.: Updates local ref arrayParam (new ref)
        Arrays.fill(arrayParam, -1); // NB.: Updates values of array obj!
        System.out.println("Exiting createNewArray(): arrayParam= "+ arrayParam);
        System.out.println("Exiting createNewArray(): arrayParam= "+ Arrays.toString(arrayParam));
    }

    public static void main(String[] args) {
        /*int i1, i2;
        i1 = 5;
        i2 = 7;
        System.out.println("In main(): i1= "+ i1 +", i2= " +i2);
        accumulate(i1, i2);
        System.out.println("In main(): i1= "+ i1 +", i2= " +i2);
        
        /*
        System.out.println("\n====================\n");
        
        System.out.println("In main(): values= "+ Arrays.toString(values));
        System.out.println("In main(): values= "+ values);
        sum(values);
        System.out.println("In main(): values= "+ Arrays.toString(values));
        */
        int[] values = {1, 2, 3, 4, 5}; 
        System.out.println("\n====================\n");
        System.out.println("In main(): values= "+ Arrays.toString(values));
        System.out.println("In main(): values= "+ values);
        createNewArray(values);
        System.out.println("In main(): values= "+ values);
        System.out.println("In main(): values= "+ Arrays.toString(values));
        
    }
}