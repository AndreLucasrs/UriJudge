package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
	
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		double n,x=0.0;
		int c = 0;
		while(c < 2){
			n = s.nextDouble();
			if(n >= 0.0 && n <= 10){
				c++;
				x+=n;
			}else{
				System.out.println("nota invalida");
			}
		}
		x = x/2;
		System.out.printf("media = %.2f\n",x);
		

	}

}
