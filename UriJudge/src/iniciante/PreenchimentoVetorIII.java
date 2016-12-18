package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetorIII {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
		double x = input.nextDouble();
		
		System.out.print("N[0] = ");
		System.out.printf("%.4f\n",x);
		for(int i = 1; i < 100;i++){
			x = x/2;
			System.out.print("N["+i+"] = ");
			System.out.printf("%.4f\n",x);
			
		}

	}

}
