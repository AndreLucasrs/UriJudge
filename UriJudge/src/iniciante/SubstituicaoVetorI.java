package iniciante;

import java.util.Scanner;

public class SubstituicaoVetorI {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int n, i;
		    for (n = 0; n <= 9; n++){
		        i = input.nextInt();
		        if (i > 0)
		            System.out.printf("X[%d] = %d\n", n, i);
		        else
		            System.out.printf("X[%d] = 1\n", n);
		    }

	}

}
