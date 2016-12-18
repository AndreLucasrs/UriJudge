package iniciante;

import java.util.Scanner;

public class Lanche {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int prod = s.nextInt();
		int qtd = s.nextInt();
		double valor;
		
		if(prod == 1){
			valor = 4.00 * qtd;
			System.out.printf("Total: R$ %.2f\n", valor);
		}else if(prod == 2){
			valor = 4.50 * qtd;
			System.out.printf("Total: R$ %.2f\n", valor);
		}else if(prod == 3){
			valor = 5.00 * qtd;
			System.out.printf("Total: R$ %.2f\n", valor);
		}else if(prod == 4){
			valor = 2.00 * qtd;
			System.out.printf("Total: R$ %.2f\n", valor);
		}else if(prod == 5){
			valor = 1.50 * qtd;
			System.out.printf("Total: R$ %.2f\n", valor);
		}
		

	}

}
