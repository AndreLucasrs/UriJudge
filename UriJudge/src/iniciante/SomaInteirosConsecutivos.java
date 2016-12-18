package iniciante;

import java.util.Scanner;

public class SomaInteirosConsecutivos {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int a, n;

		int soma = 0;
		
		
			a = input.nextInt();
			n = input.nextInt();
			while (n <= 0) {
				n = input.nextInt();

			}
			for (int i = 0; i < n; i++) {
				soma += (a + i);
			}
			System.out.println(soma);
			
		
	}
}

