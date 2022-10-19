import java.util.Scanner;

import java.lang.Math;

public class Angles {
    public static void main(String[] args){
        System.out.print("Please enter the number of degrees of angle: ");

        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();
        int normalized=0;

        if(angle<360){
            normalized=360-Math.abs(angle);
        }
        else
        if(angle>=360){
            normalized=angle-360;
        }
        System.out.println(normalized);
    }    
}
