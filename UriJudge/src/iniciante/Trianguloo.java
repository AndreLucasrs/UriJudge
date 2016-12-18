package iniciante;

import java.util.Scanner;

class Trianguloo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        
       if( (a + b > c) && (a + c > b) && (c + b > a) ){
            System.out.println("S");
        }
        else if((a + b > d) && (a + d > b) && (d + b > a)){
            System.out.println("S");
        }
        else if((d + b > c) && (d + c > b) && (c + b > d)){
            System.out.println("S");
        }
        else if((d + a > c) && (d + c > a) && (c + a > d)){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }        
    }
}
