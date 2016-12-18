package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Consumo{

	private static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		int x = s.nextInt();
		float y = s.nextFloat();
		
		float c = x/y;
		
		 System.out.printf("%.3f km/l\n",c);
	}

}
