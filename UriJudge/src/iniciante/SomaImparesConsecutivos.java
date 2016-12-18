package iniciante;

import java.util.Scanner;

public class SomaImparesConsecutivos {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		int x = s.nextInt();
		int y = s.nextInt();
		int soma=0;
		int i = 0;
		
		if(x == y+1 || y == x+1){
			soma = 0;
		}else
			if (x > y) {
			
			for (i = y+1; i < x; i++) {
				
				if (Math.abs(i) % 2 != 0) {
					soma += i;
				}

			}

		} else if (y > x) {

			for (i = x+1; i < y; i++) {

				if (Math.abs(i) % 2 != 0) {
					soma += i;
				}

			}

		}
		System.out.println(soma);

	}
}