package JuizOnline;

import java.util.Locale;
import java.util.Scanner;

	public class Geometria { // calculando um circulo passando so o raio,e o volume de uma esfera

		private static Scanner input;

		public static void main(String[] args) {
			 final double PI = 3.14159; 
			 input = new Scanner(System.in);
			 input.useLocale(Locale.US);
			  
			// System.out.println("altura");
			 double a = input.nextDouble();
			 //System.out.println("base");
			 double b = input.nextDouble();
			 //System.out.println("raio");
			 double c = input.nextDouble();
			 
			 double triangulo = (a * c) / 2;
			 double circulo = c * c * PI;
			 double trapezio = ((a + b)*c)/2;
			 double quadrado = b * b;
			 double retangulo = a * b;
			 //double volume = (4.0/3) * PI * c* c *c ;
			 
			 //System.out.printf("A=%.3f\n", volume);
			 System.out.printf("TRIANGULO: %.3f\n",triangulo);
			 System.out.printf("CIRCULO: %.3f\n" ,circulo);
			 System.out.printf("TRAPEZIO: %.3f\n",trapezio);
			 System.out.printf("QUADRADO: %.3f\n",quadrado);
			 System.out.printf("RETANGULO: %.3f\n", retangulo);
			 
			 }

	}
