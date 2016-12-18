package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class CorridaLesmas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String e;
        while((e = br.readLine()) != null){
            int entrada = Integer.parseInt(e);
            String[] entradaLesma = br.readLine().split(" ");
            int[] lesma = new int[entrada+1];
            ArrayList<Integer> lesmaList = new ArrayList<>();
            for(int i =0; i < entradaLesma.length ; i++){
                lesma[i]= Integer.parseInt(entradaLesma[i]);
            }
            for(int j = 0; j < lesma.length ; j++){
                lesmaList.add(lesma[j]);
            }
            int a = Collections.max(lesmaList,null);
                if(a < 10){
                    System.out.println(1);
                }else if(a >= 10 && a < 20 ){
                    System.out.println(2);
                }else if(a >= 20){
                    System.out.println(3);
                }
            }
            
        }
}