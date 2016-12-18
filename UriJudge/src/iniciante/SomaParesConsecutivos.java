package iniciante;

import java.util.Scanner;

public class SomaParesConsecutivos {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int x, soma;

		while (true) {
			x = input.nextInt();
			if (x == 0) {
				break;
			}

			soma = 0;

			if (x % 2 == 0) {
				soma += x;
			} else {
				soma += ++x;
			}

			for (int i = 0; i < 4; i++) {
				x += 2;
				soma += x;
			}
			System.out.println(soma);
		}
	}

}
