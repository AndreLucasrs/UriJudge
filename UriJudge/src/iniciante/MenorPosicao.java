package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenorPosicao {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);

		ArrayList<Integer> menor = new ArrayList<>();
		
		int n = s.nextInt();
		int i = 0;
		while(i < n){
			int x = s.nextInt();
			menor.add( x );
			i++;
		}
		System.out.println("Menor valor: "+Collections.min(menor));
		System.out.println("Posicao: "+menor.indexOf(Collections.min(menor)));
	}

}
