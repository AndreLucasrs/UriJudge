package matematica;

import java.util.Scanner;
import java.lang.Math;

public class PrimoRapido {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		boolean ver = false;

		int n = input.nextInt();

		for (int i = 0; i < n; ++i) {
			x = input.nextInt();

			if (x == 2) {
				System.out.println("Prime");
			} else {

				if (x % 2 == 0) {
					System.out.println("Not Prime");
				} else {

					for (int j = 3; j < Math.sqrt(x); j += 2) {
						if (x % j == 0)
							ver = true;
					}

					if (ver == true) {
						System.out.println("Not Prime");
					} else {
						System.out.println("Prime");
					}
				}
			}

			ver = false;
		}

	}

}
