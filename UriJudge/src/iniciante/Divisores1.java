package iniciante;

import java.util.Scanner;

public class Divisores1 {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		 int n, i;
		     n = input.nextInt();
		     for (i = 1; i <= n / 2; i++){
		         if (n % i == 0)
		             System.out.printf("%d\n", i);
		     }
		     System.out.printf("%d\n", n);

	}

}
