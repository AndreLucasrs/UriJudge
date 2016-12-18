package ad_hoc;

import java.util.Scanner;
import java.lang.Math;

class JogoMaior {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        
        while(true){
            int count1 = 0;
            int count2 = 0;
            int entrada = input.nextInt();
            if(entrada == 0){
                break;
            }
            for(int i =0; i < entrada; i++){
                
                int player1 = input.nextInt();
                int player2 = input.nextInt();
            
                if(player1 > player2){
                    count1++;
                }
                else if(player1 < player2){
                    count2++;
                }
            }
            System.out.println(count1+" "+count2);
            
        }

    }

}
