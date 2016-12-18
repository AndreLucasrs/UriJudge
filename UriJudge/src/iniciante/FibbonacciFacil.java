package iniciante;

import java.util.Scanner;

public class FibbonacciFacil {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int n, a, b, x, i;
		    n = input.nextInt();
		    if (n == 0){ 
		    	System.out.println("0");
		    
		    }
		
		    a = 1;
		    b = 1;
		    System.out.print("0");
		    for (i = 1; i < n; i++){
		        System.out.print(" "+ a);
		        x = a;
		        a = b;
		        b = b + x;
		    }
		    System.out.printf("\n");

	}

}
