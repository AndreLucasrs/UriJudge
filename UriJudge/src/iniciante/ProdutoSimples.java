package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples{

	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int y = s.nextInt();
		int x = s.nextInt();
		
		x= x * y;
		
		System.out.println("PROD = "+ x);
	
		
		
	}

}
