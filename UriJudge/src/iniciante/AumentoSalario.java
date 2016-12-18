package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {
	
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner (System.in);
		s.useLocale(Locale.US);
		
		double a = s.nextDouble();
		
		if((a>=0) && (a <= 400.00)){
			double b = a * 0.15;
			a = b + a;
			System.out.printf("Novo salario: %.2f\n", a);
			System.out.printf("Reajuste ganho: %.2f\n", b);
			System.out.println("Em percentual: 15 %");
		}else if((a >= 400.01) && (a<=800.00)){
			double b = a * 0.12;
			a = b + a;
			System.out.printf("Novo salario: %.2f\n", a);
			System.out.printf("Reajuste ganho: %.2f\n", b);
			System.out.println("Em percentual: 12 %");
		}else if((a >= 800.01) && (a<=1200.00)){
			double b = a * 0.10;
			a = b + a;
			System.out.printf("Novo salario: %.2f\n", a);
			System.out.printf("Reajuste ganho: %.2f\n", b);
			System.out.println("Em percentual: 10 %");
		}else if((a >= 1200.01) && (a<=2000.00)){
			double b = a * 0.07;
			a = b + a;
			System.out.printf("Novo salario: %.2f\n", a);
			System.out.printf("Reajuste ganho: %.2f\n", b);
			System.out.println("Em percentual: 7 %");
		}else if ( a >= 2.000){
			double b = a * 0.04;
			a = b + a;
			System.out.printf("Novo salario: %.2f\n", a);
			System.out.printf("Reajuste ganho: %.2f\n", b);
			System.out.println("Em percentual: 4 %");
		}

	}

}
