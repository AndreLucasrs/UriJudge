package iniciante;

import java.util.Scanner;

public class SomasImparesConsecutivosII {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		int soma = 0;
		
		for(int i = 1;i <= n ; i++){
			
			int x = s.nextInt();
			int y = s.nextInt();
			if(x == y+1 || y == x+1){
				soma = 0;
			}else if(x == y){
				soma = 0;
			}else 
				if(x > y){
					soma = 0;
				for(int a = y+1; a < x ; a ++){
					if(Math.abs(a)%2!=0){
						soma += a;
						
					}
				}
			}else if(y > x){
				soma = 0;
				for (int b = x+1; b < y;b++){
					
					if(Math.abs(b)%2!=0){
						soma += b;
					}
				}
				
			}
			System.out.println(soma);
		}

	}

}

	
