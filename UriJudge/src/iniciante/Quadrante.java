package iniciante;

import java.util.Scanner;

public class Quadrante {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int aux = 0;
		
		while(aux == 0){
		
		int	x = s.nextInt();
		int	y = s.nextInt();
			
			if(x == 0 || y == 0){
				break;
			}
			
			if((x > 0) && (y > 0)){
				System.out.println("primeiro");
			}else if((x < 0)&&(y > 0)){
				System.out.println("segundo");
			}else if((x < 0)&&(y < 0)){
				System.out.println("terceiro");
			}else if((x > 0)&&(y < 0)){
				System.out.println("quarto");
			}
			
		}

	}

}
