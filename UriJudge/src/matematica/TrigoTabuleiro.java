package matematica;

import java.util.Scanner;
import java.lang.Math;

public class TrigoTabuleiro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    
	    for(int i = 0; i < n; i++){
	            int x = input.nextInt();
	            System.out.println((long)(Math.pow(2,x)/12000)+" kg");
	    }

	}

}
