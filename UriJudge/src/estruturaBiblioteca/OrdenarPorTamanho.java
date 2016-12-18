package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.text.Collator;
import java.util.Comparator;

class ComparadorPorTamanho implements Comparator<String>{
    public int compare(String s1, String s2){
        if(s1.length() < s2.length()){
            return 1;
        }
        if(s2.length() < s1.length()){
            return -1;
        }
        return 0;
    }
    
}

class OrdenarPorTamanho{
  public static void main(String[] args) throws IOException {
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
    int input = Integer.parseInt(br.readLine());  
    
    for(int j = 0; j < input ; j++){
        String[] listar = br.readLine().split(" ");

        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        Arrays.sort(listar,comparador);

        for(int i = 0 ; i < listar.length; i ++){  

            if(i != listar.length -1){
                bw.write(listar[i]+" ");
            }else{
                bw.write(listar[i]+"\n");
            }
        }    
        bw.flush();
        
    }
    
  }
}
