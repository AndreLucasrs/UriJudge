package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.Arrays;

public class SpursRocks {
	
	public static class Time {
		int pg, cg, cp, num;
		
		public Time(int num){
			this.num = num;
			this.pg = this.cg = this.cp = 0;
		}
		
		public void computaJogo(int cg, int cp){
			this.cg += cg;
			this.cp += cp;
			if(cg > cp)
				this.pg += 2;
			else
				this.pg += 1;
		}
		
		public double cestaAvg(){
			if(cp == 0)
				return cg;
			return this.cg/(double)this.cp;
		}
	}
	
	static class TimeComparator implements Comparator <Time> {
		public int compare(Time a, Time b){
			int aux;
			if((aux = b.pg - a.pg) != 0)
				return aux;
			else if((aux = Double.compare(b.cestaAvg(), a.cestaAvg())) != 0)
				return aux;
			else if((aux = b.cg - a.cg) != 0)
				return aux;
			else
				return a.num - b.num;
		}
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // k = número da instância
        int n, aux, x, y, z, w, k;
        n = Integer.parseInt(br.readLine());
        k = 1;
        while(n != 0){
        	if(k != 1)
        		bw.write("\n");
        	Time[] t = new Time[n];
        	for(int i = 0; i < n; i++)
        		t[i] = new Time(i + 1);
        	aux = n * (n-1)/2;
        	for(int i = 0; i < aux; i++){
        		String[] e = br.readLine().split(" ");
        		x = Integer.parseInt(e[0]);
        		y = Integer.parseInt(e[1]);
        		z = Integer.parseInt(e[2]);
        		w = Integer.parseInt(e[3]);
        		t[x - 1].computaJogo(y, w);
        		t[z - 1].computaJogo(w, y);
        	}
        	Arrays.sort(t, new TimeComparator());
        	bw.write("Instancia " + Integer.toString(k++) + "\n");
        	bw.write(Integer.toString(t[0].num));
        	for(int i = 1; i < n; i++)
        		bw.write(" " + Integer.toString(t[i].num));
        	bw.write("\n");
        	n = Integer.parseInt(br.readLine());
        }
        bw.flush();
    }
}