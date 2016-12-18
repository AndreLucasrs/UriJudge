package iniciante;

import java.util.Scanner;

public class Tabuada {
	
	private static Scanner m;
	public static void main(String[] args) {
		
		int i;
		m = new Scanner(System.in);
		int a = m.nextInt();
		
		for(i = 1; i<11;i++){
			
			int b = a*i;
			
			System.out.println(i+" x "+a+" = "+b);
		}

	}

}
