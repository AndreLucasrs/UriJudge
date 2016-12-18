package iniciante;

import java.util.Scanner;

public class TipoCombustivel {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int x;
		int alcool = 0, gasolina = 0 ,diesel = 0;
		while((x = s.nextInt()) !=4  && x > 0){
			if(x > 4 || x == 0 ){
				x = s.nextInt();
			}
			if(x == 1){
				alcool++;
				
			}
			if(x == 2){
				gasolina++;
			}
			if(x == 3){
				diesel++;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
	}

}
