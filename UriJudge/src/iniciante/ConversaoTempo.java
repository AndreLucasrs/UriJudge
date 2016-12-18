package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoTempo {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int x = input.nextInt();
		//int y = x*2;
		int hora = x/3600;
		int minutos = (x-(hora*3600))/60;
		int segundos = x-(hora*3600)-(minutos*60);
		
		System.out.println(hora+":"+minutos+":"+segundos);
	}

}
