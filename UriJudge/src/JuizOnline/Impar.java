package JuizOnline;

import java.util.Scanner;

public class Impar {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner (System.in);
		
		int impar=0,negativo=0,par=0,positivo=0;
		for(int i = 0 ; i < 5; i++){
			int n = s.nextInt();
			if(n%2 == 0){
				par++;
			} 
			if(n>0){
				positivo++;
			}
			if(n%2 != 0){
				impar++;
			}
			if(n<0){
				negativo++;
			}
			
		}
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(positivo+" valor(es) positivo(s)");
		System.out.println(negativo+" valor(es) negativo(s)");

	}

}
