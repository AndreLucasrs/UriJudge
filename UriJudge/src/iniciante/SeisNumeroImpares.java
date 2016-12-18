package iniciante;

import java.util.Scanner;

public class SeisNumeroImpares {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n>0){
			if(n%2 == 0){
				n = n+1;
				for(int i = n; i <= n+10; i= i+2){
					System.out.println(i);
				}
			} else {
				n = n+2;
				for(int i = n; i <= n+10; i=i+2){
					System.out.println(i);
				}
			}
		}

	}

}
