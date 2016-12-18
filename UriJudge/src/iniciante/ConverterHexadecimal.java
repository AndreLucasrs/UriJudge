package iniciante;

import java.util.Scanner;

class ConverterHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(Integer.toHexString(a).toUpperCase());
        
    }
}
