package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);

		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		double area=((a+b)*c)/2;
		double P=a+b+c;
		
		 if (a>0 && b>0 && c>0 && a<b+c && b<a+c && c<a+b){
			 System.out.printf("Perimetro = %.1f\n", P);
		 }else{
			 System.out.printf("Area = %.1f\n", area);
		 }
			 
	
		/*
		if ((a < 0 || a >= 0) && (b < 0 || b>=0 ) && (c < 0|| c>=0)) {
			if ((a == (int) a) || (b == (int) b) || (c == (int) c)) {
				a = (a * c) / 2;
				if (a < 0) {
					a = a * (-1);
					System.out.printf("Area = %.1f\n", a);
				} else {
					System.out.printf("Area = %.1f\n", a);
				}
			}
		} else {
			a = a + b + c;
			System.out.printf("Perimetro = %.1f\n", a);
		}
		*/
	}

}
