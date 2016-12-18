package iniciante;

import java.util.Scanner;

public class QuadradoPares {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 1; i<=n ; i++){
			
			if(i%2==0){
				System.out.printf("%d^2 = %.0f\n",i, Math.pow(i, 2));
				//System.out.println(i+"^2 = "+Math.pow(i, 2));
			}
			
		}

	}

}
