package JuizOnline;

import java.util.Locale;
import java.util.Scanner;

public class Km_m {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		int horas = input.nextInt();
		int velocidade = input.nextInt();
		double distancia = (horas*velocidade);
		distancia = distancia/12;
		
		System.out.printf("%.3f\n", distancia);
		
		//int y = x*2;
		//int hora = x/3600;
		//int minutos = (x-(hora*3600))/60;
		//int segundos = x-(hora*3600)-(minutos*60);
		
		//System.out.println(hora+":"+minutos+":"+segundos);
	}

}
