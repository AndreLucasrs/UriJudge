package matematica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriânguloTrinomialaVinganca {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int R = Integer.parseInt(entrada.readLine());
		long MOD = 2147483647;
		long ans = 1;
		long P = 3;

		while(R>0){ 
		    if(R%2==1) ans = (ans*P)%MOD; 
		    P = (P*P)%MOD; 
		    R = (R/2);
		}
		System.out.println(ans);
	}
}
