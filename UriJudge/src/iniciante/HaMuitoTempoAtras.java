package iniciante;

import java.util.Scanner;
import java.lang.Math;

class HaMuitoTempoAtras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
        
       for(int i = 0; i < t1 ; i++){
           int a = input.nextInt();
           a = a - 2014;
           if(a > 0){
               
               System.out.println(a+" A.C.");
           }else{
               System.out.println(Math.abs(a-1)+" D.C.");
           }
           
           
       }  
        
    }
}
