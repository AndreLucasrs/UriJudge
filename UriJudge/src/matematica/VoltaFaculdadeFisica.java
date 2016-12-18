package matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class VoltaFaculdadeFisica {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String e;
        
        while((e = br.readLine()) != null){
            String[] entrada = e.split(" ");
            long op = Long.parseLong(entrada[0]);
            long op2 = Long.parseLong(entrada[1]);
            
            long count = (op * op2)*2;

            System.out.println(count);
        }    
    }
}
