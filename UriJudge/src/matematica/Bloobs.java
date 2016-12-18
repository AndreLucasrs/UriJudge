package matematica;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Bloobs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N;
		double C, i, x;
		N = input.nextInt();
		x = 0;
		while (N > 0) {
			C = input.nextDouble();
			while (C > 1) {
				C = C / 2;
				x++;
			}
			System.out.printf("%.0f dias\n",x);
			N--;
			x = 0;
		}

	}

}
