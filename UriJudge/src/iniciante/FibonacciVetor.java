package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciVetor {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		long nTeste = input.nextLong();
		long x;
		for(long i=0 ; i<nTeste;i++){
			ArrayList<Long> valores = new ArrayList<>();
			long valor = input.nextLong();
			if (valor == 0){ 
		    	System.out.println("Fib(0) = 0");
		    
		    }
			
		    long a = 1;
		    long b = 1;
		    
		    for (int y = 1; y < valor+1; y++){
		        valores.add(a);
		    	x = a;
		        a = b;
		        b = b + x;
		    }
		    if(valores.size()>0){
		    	System.out.println("Fib("+valor+")"+" = "+valores.get(valores.size()-1));
		    }	
		}

	}

}
