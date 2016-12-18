package iniciante;

import java.util.Scanner;

class TriDu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        if ( a == b){
            System.out.println(a);
        }else if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        
    }
}
