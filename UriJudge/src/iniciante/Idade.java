package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Idade {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		double idade = 0.0;
		double soma = 0.0;
		int i = 0;
		double media = 0.0;
			idade = s.nextDouble();
		do{
			i++;
			soma = soma + idade;
			idade = s.nextDouble();
		}while( idade>= 0 );{
			media = soma/i;
			System.out.printf("%.2f\n", media);
		}
	}

}
