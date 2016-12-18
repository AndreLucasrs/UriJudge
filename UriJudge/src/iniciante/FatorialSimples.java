package iniciante;

import java.util.Scanner;

public class FatorialSimples {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int op;
	    int fat = 1;
	    
	    op = input.nextInt();
	    
	    for(int i = 0; i < (op-1); i++){
	            fat *= (op - i);
	    }
	    System.out.println(fat);

	}

}
