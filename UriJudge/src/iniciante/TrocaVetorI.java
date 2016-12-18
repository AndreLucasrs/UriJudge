package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrocaVetorI {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		ArrayList<Integer> troca = new ArrayList<>();
		
		for(int i = 0 ; i < 20; i++){
			int n = s.nextInt();
			troca.add(n);
		}
		Collections.reverse(troca);
		for(int b = 0 ;  b < troca.size();b++){
			
			System.out.println("N["+b+"] = "+troca.get(b));
		}
	
	}

}
