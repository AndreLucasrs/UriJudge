package iniciante;

import java.util.Scanner;

public class RestoDivisao {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int x, y;
		double a;
		     x = input.nextInt();
		     y = input.nextInt();
		
		    if (x > y){
		        a = x;
		        x = y;
		        y = (int) a;
		    }
		
		    for (int i = x + 1; i < y; i++){
		        if (i % 5 == 2 || i % 5 == 3)
		            System.out.println(i);
		    }

	}

}
