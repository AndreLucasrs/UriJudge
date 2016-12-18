package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media {
	
		private static Scanner input;

		public static void main(String[] args) {
		
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		  
		 System.out.println("a");
		 //double a = input.nextDouble();
		 String nome = input.next();
		 System.out.println("b");
		 double b = input.nextDouble();
		 System.out.println("c");
		 double c = input.nextDouble();
		
		 //a = a * 2;
		 //b = b * 3;
		 //c = c * 5;
		 
		 b = b + (c*0.15);
		 
		 //a = (a + b + c) / 10;
		
		//System.out.printf("MEDIA = %.1f\n",a);
		 System.out.printf("TOTAL = R$ %.2f\n",b);
	}

}
