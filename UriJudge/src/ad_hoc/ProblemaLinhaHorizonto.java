package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ProblemaLinhaHorizonte {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String e;
        int[] x = new int[10001];
        int lold, hold, rold, li, hi, ri, i, init, maxRi;
        lold = 0;
        hold = 0;
        rold = 0;
        maxRi = 0;
        while((e = br.readLine()) != null) {
            String[] e2 = e.split(" +");
            li = Integer.parseInt(e2[0]);
            hi = Integer.parseInt(e2[1]);
            ri = Integer.parseInt(e2[2]);
            if(hi < hold && li <= rold){
                init = rold;
            }    
            else{
                init = li;
            }    
            if(hi != 0){
                for(i = init; i < ri; i++){
                    if(x[i] < hi){
                        x[i] = hi;
                    }    
                }
            }
            if(maxRi < ri){
                maxRi = ri;
            }    
            lold = li;
            hold = hi;
            rold = ri;
        }
        hold = 0;
        for(i = 0; i < maxRi; i++){
            if(hold != x[i]){
                System.out.print(i+" "+x[i]+" ");
                hold = x[i];
            }
        }
        System.out.println(maxRi+" 0");
    }
}
