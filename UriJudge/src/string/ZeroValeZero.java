package string;

import java.util.Scanner;
import java.util.ArrayList;

public class ZeroValeZero{
    public static void main (String[] args)  {
        Scanner input = new Scanner(System.in);
        
        while(true){
            int m = input.nextInt();
            int n = input.nextInt();
            if(m == 0 && n == 0 ){
                break;
            }
            int resultado = m + n;
            String result = Integer.toString(resultado);
            String total = result.replace("0", "");
            
            System.out.println(total);        
            
        }
        
        
    }
}