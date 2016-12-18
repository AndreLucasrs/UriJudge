package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class DeQuemVez {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int t1 = Integer.parseInt(a);
        
        for(int i = 0; i < t1 ; i++){
            
            String[] escolhe = br.readLine().split(" ");
            String[] valores = br.readLine().split(" ");
            
            int chute1 = Integer.parseInt(valores[0]);
            int chute2 = Integer.parseInt(valores[1]);
            int resultado = chute1+chute2;
            
            if(escolhe[1].equals("PAR") && resultado%2==0){
                System.out.println(escolhe[0]);
                
            }
            else if(escolhe[3].equals("PAR") && resultado%2==0){
                System.out.println(escolhe[2]);
            
            
            }else if((escolhe[1].equals("IMPAR") && resultado%2!=0)){
                System.out.println(escolhe[0]);
            
            }
            else if((escolhe[3].equals("IMPAR") && resultado%2!=0)){
                System.out.println(escolhe[2]);
            
            }
            
            
            Arrays.fill(escolhe,null);
            Arrays.fill(valores,null);
            

        }
        
    }
}
