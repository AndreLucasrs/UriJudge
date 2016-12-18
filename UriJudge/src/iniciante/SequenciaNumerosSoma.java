package iniciante;

import java.util.Scanner;

public class SequenciaNumerosSoma {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		int soma = 0;
		int i = 0;

		while (soma >= 0) {
			int m = s.nextInt();
			int n = s.nextInt();
			if (m == 0 || m < 0) {
				break;
			}
			if (n == 0 || n < 0) {
				break;
			}
			if (m > n) {
				soma = 0;
				for (i = n; i <= m; i++) {

					soma += i;
					System.out.print(i + " ");

				}
				System.out.println("Sum=" + soma);

			} else if (n > m) {
				soma = 0;
				for (i = m; i <= n; i++) {

					soma += i;
					System.out.print(i + " ");

				}
				System.out.println("Sum=" + soma);

			}

		}

	}
}
