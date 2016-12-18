package iniciante;

import java.util.Scanner;

public class Multiplos13 {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		    int x, y, aux;
		    int soma = 0;
		    x = input.nextInt();  
		    y = input.nextInt();
		    
		    if(x > y){
		        aux = y;
		        y = x;
		        x = aux;
		    }
		    
		    for(int i = x; i <= y; i++){
		            if(i%13 != 0)
		                 soma += i;
		    }
		    System.out.println(soma);

	}

}
