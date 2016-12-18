package JuizOnline;

import java.util.Scanner;

public class Pipas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long r =0;
		long aux = 0;
		if(x == 3){
			System.out.println(0);
		}else if(x < 3 && x > 0){
			System.out.println(-1);
		}else if(x == 4){
			System.out.println(2);
		}else{
			  
			for (int i=2; i<x-1; i++){
				r=aux+i;
				aux=r;   
			}
			System.out.println(aux);
		}

	}

}
