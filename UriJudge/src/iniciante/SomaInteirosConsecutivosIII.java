package iniciante;

import java.util.Scanner;

public class SomaInteirosConsecutivosIII {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int soma = 0;
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();

			if (x > y) {
				soma = 0;
				for (int j = y; j < (x+y*2); j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			}
			if (y > x) {
				soma =0;
				for (int j = x; j < (2*y+x); j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			} else {
				soma = 0;
				for (int j = x; j < (x+y*2); j++) {
					if (j % 2 != 0) {
						soma += j;
					}
					
				}

			}
			System.out.println(soma);

		}
	}
}
