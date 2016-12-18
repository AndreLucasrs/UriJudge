package matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SomaFatorias {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String e;
        
        while((e = br.readLine()) != null){
            String[] entrada = e.split(" ");
            long op = Long.parseLong(entrada[0]);
            long fat = 1;
            long op2 = Long.parseLong(entrada[1]);
            long fat2 = 1;

            for(int i = 0; i < (op-1); i++){
                    fat *= (op - i);
            }
            for(int i = 0; i < (op2-1); i++){
                    fat2 *= (op2 - i);
            }
            long count = fat + fat2;

            System.out.println(count);
        }    
    }
}
