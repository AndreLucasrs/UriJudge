package iniciante;

import java.io.IOException;

import java.util.Locale;
import java.util.Scanner;

public class Esfera { 

	private static Scanner input;

	public static void main(String[] args) {
		 final double PI = 3.14159; 
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		 double raio = input.nextDouble();
		 
		 double volume = (4.0/3) * PI * raio* raio *raio ;
		 
		 System.out.printf("VOLUME = %.3f\n", volume);
		 
	}

}
