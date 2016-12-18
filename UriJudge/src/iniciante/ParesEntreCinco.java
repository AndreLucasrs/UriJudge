package iniciante;

import java.util.Scanner;

public class ParesEntreCinco {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int numero, qtdPares = 0;
		   
		   for(int i = 1; i <= 5; i++){
		      numero = s.nextInt();
		      if(numero % 2 == 0)
		         qtdPares++;
		   }
		   System.out.println(qtdPares+" valores pares");

	}

}
