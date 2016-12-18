package iniciante;

import java.util.Scanner;

public class NumeroPerfeito {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int n, s, y = 0;
		int x = input.nextInt();
		while (y < x) {
			n = input.nextInt();
			s = 0;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					s += i;
				}
			}
			if (s == n) {
				System.out.println(n + " eh perfeito");
			} else {
				System.out.println(n + " nao eh perfeito");
			}
			y++;
		}
	}

}
