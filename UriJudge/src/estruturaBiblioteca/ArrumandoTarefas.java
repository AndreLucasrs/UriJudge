package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrumandoTarefas {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String e;
        while((e = input.readLine()) != null){
            String[] entrada = e.split(" ");
            int tarefas = Integer.parseInt(entrada[0]);
            int horas = Integer.parseInt(entrada[1]); 
            
            int[] melhorDv = new int[tarefas+1];
            int[] melhorT = new int[1000];
            for(int i = 1; i <= tarefas; i++){
                String[] casos = input.readLine().split(" ");
                int custo = Integer.parseInt(casos[0]);
                int tempo = Integer.parseInt(casos[1]);
                melhorDv[i] = custo;
                
                if(melhorT[custo] == 0){
                    melhorT[custo] = tempo;
                }
                else if(melhorT[custo] == melhorT[custo]){
                    if(melhorDv[i] > melhorDv[i-1]){
                        melhorT[custo-1] = tempo;
                    }
                    else{
                        melhorT[custo+1]= tempo;
                    }
                }
                
            }
            
            Arrays.sort(melhorDv);
            Arrays.sort(melhorT);
            ArrayList<Integer> melhorDever = new ArrayList<>();
            for(int i = 0; i < melhorDv.length; i++){
                melhorDever.add(melhorDv[i]);
            }
            Collections.reverse(melhorDever);
            //se tempo não for menos que horas tem que fazer de outra forma se ele é maior mantem normal
            
            if(melhorT[melhorT.length -1 ] > horas){
                for(int i =0; i < horas ; i++){
                    melhorDever.remove(i);
                    melhorDever.add(i,0);
                }
            
                int count = 0;

                for(int i = 0; i < melhorDever.size(); i ++){
                    count += melhorDever.get(i);
                
                }
                System.out.println(count);
            }
            else{
                for(int i =0; i < melhorT[melhorT.length-1]; i++){
                	melhorDever.set(i,0);
                }
            
                int count = 0;

                for(int i = 0; i < melhorDever.size(); i ++){
                    count += melhorDever.get(i);
                
                }
                System.out.println(count);
            }
            
        }
        

    }

}