package matematica;

import java.util.Scanner;

class SomaNatural {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        
        long total = ((a + b) * ((b - a) + 1))/2 ;
        
        System.out.println(total);

    }

}
