package ad_hoc;

import java.util.Scanner;

public class Tornado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int n = input.nextInt();
			if (n == 0){
				break;
			}
			int zero = 0;
			int soma = 0;
			int inicio = 0;
			int postes = 0;
			for (int i = 0; i < n; i++) {
				int numero = input.nextInt();
				if (numero == 0 && inicio == 0) {
					zero++;
					postes++;
				} else if (numero == 0 && inicio == 1) {
					postes++;
				}
				if (numero == 1) {
					inicio = 1;
					soma += postes / 2;
					postes = 0;
				}
			}
			if (postes > 0) {
				soma -= zero / 2;
				postes += zero;
				soma += postes / 2;
			}
			System.out.println(soma);
		}
	}
}
