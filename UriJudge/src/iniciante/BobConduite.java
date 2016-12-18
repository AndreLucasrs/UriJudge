package iniciante;

import java.util.Scanner;

public class BobConduite {

	private static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.println("Valor");
		int v = s.nextInt();
		for (int n = 0; n < v; n++){
			System.out.println("raio 1");
			int r1 = s.nextInt() + s.nextInt();
	
			System.out.println(r1);		
		}

	}

}
