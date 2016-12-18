package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Numbero");
		int number = input.nextInt();
		System.out.println("horas tra");
		int ht = input.nextInt();
		System.out.println("recebe por hora");
		double rh = input.nextDouble();
		
		double x = rh * ht;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f\n",x);
		
	}

}
