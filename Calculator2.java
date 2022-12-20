import java.util.Scanner;

public class Calculator2{
    public int add(int i1, int i2){
        int sum=i1+i2;
        return sum;
    }

    public int multiply(int i1,int i2){
        int multi=0;
        for(int i=0; i<=i1; i++){
            multi=add(multi,i2);
        }
        return multi;
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int param1,param2,res;

            System.out.println("Provide two positive intregers: ");

            param1=sc.nextInt();
            param2=sc.nextInt();

            Calculator2 clt=new Calculator2();

            res=clt.multiply(param1,param2);

            System.out.println(param1 + " times " + param2 + " equals " + res);
        }    
    }      
}
