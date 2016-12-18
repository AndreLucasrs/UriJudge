package JuizOnline;

import java.util.Scanner;

public class Pares {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int numero, qtdPares = 0;
		   int a = s.nextInt();
		   for(int i = 1; i <= a; i=i+2){
			  System.out.println(i+" valores pares");
		     /* numero = s.nextInt();
		      if(numero % 2 == 0)
		         qtdPares++;*/
		   }
		  

	}

}
