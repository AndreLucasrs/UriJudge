package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EconomiaBrasileira {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(entrada.readLine());
		String s[]= entrada.readLine().split(" ");
		int cont=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("0"))
				cont++;
			
		}
		
		if(cont>(n/2)+1)
			System.out.println("S");
		else
			System.out.println("N");
	}

}
