package iniciante;

import java.util.Scanner;

public class PUM {

	private static Scanner a;

	public static void main(String[] args) {
		a = new Scanner(System.in);
		int N, numero = 1;

		N = a.nextInt();

		for (int i = 1; i <= N; i++) {
			for (; numero <= 4 * N; numero++) {
				if (numero % 4 == 0) {
					System.out.println("PUM");
				} else {
					System.out.print(numero + " ");
				}
			}

		}
	}

}
