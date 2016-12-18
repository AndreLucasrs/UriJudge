package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media1{
	
		private static Scanner input;

		public static void main(String[] args) {
		
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		  
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		
		 a = a * 3.5;
		 b = b * 7.5;
		 
		 a = (a + b) / 11;
		
		 System.out.printf("MEDIA = %.5f\n",a);

	}

}
