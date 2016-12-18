package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class VariasNotasValidacao {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		input.useLocale(Locale.US);

		int r, c;
		double n, s;

		do {
			c = 0;
			s = 0.0;
			while (c < 2) {
				n = input.nextDouble();
				if (n >= 0.0 && n <= 10.0) {
					s += n;
					c++;
				} else {
					System.out.printf("nota invalida\n");
				}
			}
			System.out.printf("media = %.2f\n", s / 2.0);
			do {
				System.out.printf("novo calculo (1-sim 2-nao)\n");
				r = input.nextInt();
			} while (r != 1 && r != 2);
		} while (r != 2);

	}
}

