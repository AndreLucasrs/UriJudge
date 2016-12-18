package paradigma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

class Lucro{
  public static void main(String[] args) throws IOException {
     
    BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    String numD, custoD;  
    
    while((numD = input.readLine()) != null){
        int numDias = Integer.parseInt(numD);
        int custoDias = Integer.parseInt(input.readLine());
        int maxP = 0;
        int somaP = 0;
        for(int i = 0; i < numDias ; i++){
            int r = Integer.parseInt(input.readLine());
            somaP = Math.max(0,somaP + r - custoDias);
            maxP = Math.max(somaP,maxP);
        }
        System.out.println(maxP);
    }  
      
  }
}
