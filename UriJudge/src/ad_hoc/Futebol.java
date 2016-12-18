package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Futebol {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String e;
        while((e = input.readLine()) != null){
            String[] entrada = e.split(" ");
            int partidas = Integer.parseInt(entrada[0]);
            int golsPlus = Integer.parseInt(entrada[1]); 
            int count = 0;
            ArrayList<Integer> diferenca = new ArrayList<>();
            for(int i = 0; i < partidas; i++){
                String[] jogo = input.readLine().split(" ");
                int feito = Integer.parseInt(jogo[0]);
                int sofrido = Integer.parseInt(jogo[1]);
                
                if(feito == sofrido && golsPlus > 0){
                    count+=3;
                    golsPlus--;
                    
                }
                else if(feito > sofrido){
                    count +=3;
                }
                else if(feito == sofrido) {
                    count++;
                }
                else if(sofrido > feito){
                    int valor = sofrido - feito;
                    diferenca.add(valor);
                   
                }
            }
            
            Collections.sort(diferenca);
            
            for(int i = 0; i < diferenca.size(); i++){
                if(golsPlus >= diferenca.get(i)+1){
                    int v = diferenca.get(i)+1;
                    golsPlus = golsPlus - v;
                    count+=3;
                }
                else if(golsPlus == diferenca.get(i)){
                    count++;
                    golsPlus -= diferenca.get(i);
                }
                
            }
            System.out.println(count);
            
        }
        

    }

}