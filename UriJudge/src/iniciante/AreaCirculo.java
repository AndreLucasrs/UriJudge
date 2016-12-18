package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	private static Scanner input;

	public static void main(String[] args) {
		 final double PI = 3.14159;
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		 double raio = input.nextDouble();
		 
		 double area = raio * raio * PI;
		 
		 System.out.printf("A=%.4f\n", area);
		 
		 
	}

}
