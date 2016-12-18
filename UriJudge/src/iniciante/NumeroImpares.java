package iniciante;

import java.util.Scanner;

public class NumeroImpares {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		   int a = s.nextInt();
		   for(int i = 1; i <= a; i=i+2){
			  System.out.println(i);
		     
		   }
		  

	}

}
