package iniciante;

import java.util.Scanner;

class Mjolnir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
       
       for(int i = 0; i < t1 ; i++){
           String a = input.next();
           int v = input.nextInt();
           if(a.equals("Thor")){
               System.out.println("Y");
           }else{
               System.out.println("N");
           }
           
       }    
    }
}
