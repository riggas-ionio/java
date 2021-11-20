public class ArrayLoopMulti {
    
    public static void iterArray( int[][] array) {
        System.out.println("Classic-for:");
        for (int i=0; i<array.length; i++) {
            for ( int j=0; j<array[i].length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Enhanced-for:");
        for (int[] row: array) {
            for ( int elem: row) {
                System.out.print(" "+elem);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        
        int[][] a = new int[3][4]; 

        int[][] b = {{1, 2}, {3, 4}}; 

        int[][] c = new int[2][]; // create 2 rows 
        c[0] = new int[5];  
        // create 5 columns for row 0 
        c[1] = new int[3]; 
        // create 3 columns for row 1 
        
        iterArray(a);
        iterArray(b);
        iterArray(c);
       
    }
}