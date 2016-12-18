package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Area { // calculando um circulo passando so o raio,e o volume de uma esfera

	private static Scanner input;

	public static void main(String[] args) {
		 final double PI = 3.14159; 
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		 System.out.println("raio");
		 double raio = input.nextDouble();
		 
		 //double area = raio * raio * PI;
		 
		 double volume = (4.0/3) * PI * raio* raio *raio ;
		 
		 System.out.printf("A=%.3f\n", volume);
		 
		 }

	}

