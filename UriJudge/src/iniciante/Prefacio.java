package iniciante;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Prefacio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        a = input.nextInt();
        b = input.nextInt();
        c = (int) a / b;
        d = a % b;
        if( d < 0){
            d += Math.abs(b);
            if (b > 0){
                c--;
            }    
            else{
                c++;
            }    

        }
        System.out.println(c+" "+d);
    }
}
