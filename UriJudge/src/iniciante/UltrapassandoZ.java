package iniciante;

import java.util.Scanner;

public class UltrapassandoZ {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int x, s = 0, z, n = 0;

		x = input.nextInt();
		z = input.nextInt();
		while (z <= x) {
			z = input.nextInt();
		}
		for (int i = x; s <= z; i++) {
			s += x++;
			n++;
		}

		System.out.println(n);
	}

}
