package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media2{
	
		private static Scanner input;

		public static void main(String[] args) {
		
		 input = new Scanner(System.in);
		 input.useLocale(Locale.US);
		 
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		
		 a = a * 2;
		 b = b * 3;
		 c = c * 5;
		 
		 a = (a + b + c) / 10;
		
		 System.out.printf("MEDIA = %.1f\n",a);

	}

}
