package iniciante;

import java.util.Scanner;

public class CrescenteDescrescente {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int x,y;
		while((x = s.nextInt()) != (y = s.nextInt())){
			if(x>y){
				System.out.println("Decrescente");
			}else if(x<y){
				System.out.println("Crescente");
			}
		}
		

	}

}
