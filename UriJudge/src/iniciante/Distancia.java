package iniciante;

import java.io.IOException;

import java.util.Scanner;

public class Distancia {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = x*2;
		
		System.out.println(y+" minutos");
	}

}
