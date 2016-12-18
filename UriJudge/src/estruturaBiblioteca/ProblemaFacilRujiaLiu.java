package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
 
public class ProblemaFacilRujiaLiu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, m;
        String e;
        String[] e1;
        while((e = br.readLine()) != null){
            int k, aux;
            int[] numInd = new int[1000001];
            LinkedList<Integer>[] v = new LinkedList[1000001];
            String[]  e3, e2 = br.readLine().split(" ");
            e1 = e.split(" ");
            n = Integer.parseInt(e1[0]);
            m = Integer.parseInt(e1[1]);
            for(int i = 0; i < n; i++){
                aux = Integer.parseInt(e2[i]);
                if(v[aux] == null)
                    v[aux] = new LinkedList<Integer>();
                numInd[aux]++;
                v[aux].addLast(i + 1);
            }
            while(--m >= 0){
                e3 = br.readLine().split(" ");
                k = Integer.parseInt(e3[0]);
                aux = Integer.parseInt(e3[1]);
                if(numInd[aux] < k || v[aux] == null)
                    bw.write("0\n");
                else
                    bw.write(String.format("%d\n", v[aux].get(k - 1)));
                bw.flush();
            }
        }
    }
}