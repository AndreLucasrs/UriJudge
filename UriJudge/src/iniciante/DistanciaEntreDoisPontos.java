package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
	
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		
		x2 = x2 - x1;
		x2 = x2 = Math.pow(x2, 2);
		
		y2 = y2 - y1;
		y2 = Math.pow(y2, 2);
		
		y2 = y2 + x2;
		y2 =  Math.sqrt(y2);
				
		System.out.printf("%.4f\n",y2);
		
	}

}
