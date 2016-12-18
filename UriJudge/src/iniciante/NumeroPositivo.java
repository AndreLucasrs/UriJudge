package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NumeroPositivo {
	
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		double numero;
		int qtdPares = 0;
		   
		   for(int i = 1; i <= 6; i++){
		      numero = s.nextDouble();
		      if(numero > 0)
		         qtdPares++;
		   }
		   System.out.println(qtdPares+" valores positivos");

	}

}