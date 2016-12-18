package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class PositivoMedia {

	private static Scanner c;
	public static void main(String[] args) {
		c = new Scanner(System.in);
		c.useLocale(Locale.US);
		int i;
		double n;
		double soma = 0;
		int div = 0;
		double media = 0;
		for (i = 0; i <6 ;i++){
			n = c.nextDouble();
			
			if(n > 0){
				soma = soma + n;
				div++;
			}
		}
		media = soma/div;
		System.out.println(div+" valores positivos");
		System.out.printf("%.1f\n",media);
	}

}
