package iniciante;

import java.util.Scanner;

class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
        
       for(int i = 0; i < t1 ; i++){
           int v = input.nextInt();
           if(v%2 == 0){
               System.out.println(0);
           }else{
               System.out.println(1);
           }
           
       }  
        
    }
}
