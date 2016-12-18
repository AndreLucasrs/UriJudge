package iniciante;

import java.io.IOException;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus{
	
		private static Scanner input;

		public static void main(String[] args) {
		
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		 
		 String nome = input.next();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		 
		 b = b + (c*0.15);
		 
		 System.out.printf("TOTAL = R$ %.2f\n",b);
	}

}
