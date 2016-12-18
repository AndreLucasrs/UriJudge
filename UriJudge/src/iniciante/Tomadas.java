package iniciante;

import java.util.Scanner;

class Tomadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
        int t4 = input.nextInt();
        int count = (t1+t2+t3+t4)-3;
        System.out.println(count);
        
    }
}
