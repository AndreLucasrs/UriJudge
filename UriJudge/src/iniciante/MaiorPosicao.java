package iniciante;

import java.util.Scanner;

public class MaiorPosicao {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int x, count, posicao = 0, maior = 0;

		for (count = 1; count <= 5; count++) {
			x = s.nextInt();
			if (x > maior) {
				maior = x;
				posicao = count;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
	}
}
