package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class GastoCombustivel {

	private static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		int a = s.nextInt();
		float b = s.nextFloat();
		
		float c = a/b;
		
		 System.out.printf("%.3f km/l\n",c);
	}

}
