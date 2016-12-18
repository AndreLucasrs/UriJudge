package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class PreenchimentoVetorII {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		ArrayList<Integer> valor = new ArrayList<>();
		int i = 0;
		int x = 0;
		int a = s.nextInt();
		while( i < 1000 ){
			x = 0;
			for(x = 0; x < a; x++){
				valor.add(x);
				
			}
			System.out.println("N["+i+"] = "+valor.get(i));
			x++;
			 i++;
		}

	}

}
