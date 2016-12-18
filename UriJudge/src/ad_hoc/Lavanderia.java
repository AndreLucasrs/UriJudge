package ad_hoc;

import java.util.Scanner;
import java.lang.Math;

class Lavanderia {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int la = input.nextInt();
        int lb = input.nextInt();
        int sa = input.nextInt();
        int sb = input.nextInt();
        
        if(n >= la && n <= lb && n >= sa && n <= sb){
            System.out.println("possivel");
        }
        else{
            System.out.println("impossivel");
        }

    }

}
