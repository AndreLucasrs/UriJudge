package iniciante;

import java.util.Scanner;
import java.util.ArrayList;

class IdentificandoCha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        ArrayList<Integer> entrada = new ArrayList<>();
        int count = 0;
        for(int j = 0; j < 5 ; j ++){
            int v = input.nextInt();
            entrada.add(v);
        }
        for(int i = 0; i < entrada.size() ;i++){
            if(a == entrada.get(i)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
