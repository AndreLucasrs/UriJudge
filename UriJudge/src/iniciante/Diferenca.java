package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {
		
		private static Scanner input;
	
		public static void main(String[] args) {
		
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		  
		 System.out.println("a");
		 int a = input.nextInt();
		 System.out.println("b");
		 int b = input.nextInt();
		 System.out.println("c");
		 int c = input.nextInt();
		 System.out.println("d");
		 int d = input.nextInt();

		 a = (a * b) - (c * d);
		
		 System.out.println("DIFERENCA = "+a);
	
		}

}
