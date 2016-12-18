package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		int n = s.nextInt();
		double a,b,c,media;
		
		for(int i = 0; i < n ; i ++){
			
			a = s.nextDouble()*2;
			b = s.nextDouble()*3;
			c = s.nextDouble()*5;
			
			media = (a+b+c)/10;
			System.out.printf("%.1f\n",media);
			
		}

	}

}
