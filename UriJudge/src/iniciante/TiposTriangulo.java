package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class TiposTriangulo {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);

		ArrayList<Double> ordenado = new ArrayList<Double>();
		double a;
		double b;
		double c;

		ordenado.add(a = s.nextDouble());
		ordenado.add(b = s.nextDouble());
		ordenado.add(c = s.nextDouble());

		Collections.sort(ordenado);

		while (a > 0 && b > 0 && c > 0) {

			if ((ordenado.get(2)) >= ((ordenado.get(0)) + (ordenado.get(1)))) {
				System.out.println("NAO FORMA TRIANGULO");
				break;
			}

			if (Math.pow(ordenado.get(2), 2) == (Math.pow(ordenado.get(0), 2) + Math
					.pow(ordenado.get(1), 2))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(ordenado.get(2), 2) > (Math.pow(ordenado.get(0), 2) + Math
					.pow(ordenado.get(1), 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(ordenado.get(2), 2) < (Math.pow(ordenado.get(0), 2) + Math
					.pow(ordenado.get(1), 2))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if ((a == b) && (a == c)) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if (((a == b) && (b != c))) {
				System.out.println("TRIANGULO ISOSCELES");
			} else if (((b == c) && (c != a))) {
				System.out.println("TRIANGULO ISOSCELES");
			} else if (((a == c) && (a != b))) {
				System.out.println("TRIANGULO ISOSCELES");
			}
			break;
		}

	}

}

