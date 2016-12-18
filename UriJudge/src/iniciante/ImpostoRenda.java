package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoRenda {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		double valor;
		double n = s.nextDouble();
		
		
		if(n >=0 && n <= 2000.00){
			System.out.println("Isento");
		}else if(n >= 2000.01 && n <= 3000.00){
			n=n-2000;
			valor = n*0.08;
			System.out.printf("R$ %.2f\n", valor);
		}else if(n >= 3000.01 && n <= 4500.00){
			n=n-3000;
			valor = (n*0.18)+80.00;
			
			System.out.printf("R$ %.2f\n", valor);
		}else if(n > 4500.00){
			n=n-4500;
			valor = (n*0.28)+350.00;
			System.out.printf("R$ %.2f\n", valor);
		}

	}

}
