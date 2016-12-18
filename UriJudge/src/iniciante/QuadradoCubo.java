package iniciante;

import java.util.Scanner;

public class QuadradoCubo {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int n, i;
		    n = input.nextInt();
		    for (i = 1; i <= n; i++){
		        System.out.printf("%d %d %d\n", i, i * i, i * i * i);
		    }

	}

}
