package paradigma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CortandoCanos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String aux[] = entrada.readLine().split(" ");
		int N = Integer.parseInt(aux[0]);
		int T= Integer.parseInt(aux[1]);
		  int[] dp=new int [5000];
		  int[] C=new int [5000];
		  int[] V=new int [5000];
		  
		for (int i = 0; i < N; i++) {
			aux = entrada.readLine().split(" ");
			int cc = Integer.parseInt(aux[0]);
			int vv= Integer.parseInt(aux[1]);
			C[i]=cc;
			V[i]=vv;
		}
		for(int i=0; i<=T; i++) {
		  
			dp[i] = 0;
		    for(int j=0; j<N; j++) {
		        if(C[j] <= i) {
		            dp[i] = Math.max(dp[i], dp[i - C[j]] + V[j]);
		        }
		    }
		}
		System.out.println(dp[T]);
	}
}
