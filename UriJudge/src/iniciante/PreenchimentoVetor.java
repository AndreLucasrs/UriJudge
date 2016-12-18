package iniciante;

import java.util.Scanner;

public class PreenchimentoVetor {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int i;
		int n = s.nextInt();
		
		for(i = 0;i < 10; i++){
			System.out.println("N["+i+"] = "+n);
			n*=2;
		}

	}

}
