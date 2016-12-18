package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class EnigmaPronolandia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        char[] quebra = a.toCharArray();
        ArrayList<Integer> ordena = new ArrayList<>();
        for(int i = 0; i < quebra.length ; i++){
            int b = Character.getNumericValue(quebra[i]);
            ordena.add(b);
        }
        Collections.reverse(ordena);
        for(int v = 0; v < ordena.size() ; v++){
            System.out.print(ordena.get(v));
        }
        System.out.println();
    }    

}
