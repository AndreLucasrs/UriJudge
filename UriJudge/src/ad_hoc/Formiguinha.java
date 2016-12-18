package ad_hoc;

import java.util.Scanner;
import java.lang.Math;
class Formiguinha {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        for(int i = 1; i <= entrada; i++){
            int formiga = input.nextInt();
            double andar = 0;
            if(formiga%2==0){
                System.out.println(formiga/2);
            }
            else{
                
                System.out.println(Math.abs(formiga/2)+1);
            }
        }

    }

}