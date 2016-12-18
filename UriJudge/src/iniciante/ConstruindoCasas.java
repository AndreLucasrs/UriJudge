package iniciante;

import java.util.Scanner;
import java.lang.Math;

class ConstruindoCasas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a =0;
        int b =0; 
        int c =0;
        double tamanho = 0;
        while(true){
            a = input.nextInt();
            if(a == 0){
                break;
            }
            b = input.nextInt();
            c = input.nextInt();
            tamanho = (100 * a * b) / c;
            int tamanho1 = (int) Math.floor(Math.sqrt(tamanho));
            System.out.println(tamanho1);
        }
       
    }
}
