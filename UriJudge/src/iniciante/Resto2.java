package iniciante;

import java.util.Scanner;

public class Resto2 {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int n = s.nextInt();
	
		for(int i = 1; i <= 10000;i++){
			
			if(i%n==2){
				System.out.println(i);
			}
		}

	}

}
