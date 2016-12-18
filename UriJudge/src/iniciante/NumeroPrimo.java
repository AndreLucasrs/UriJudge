package iniciante;

import java.util.Scanner;

public class NumeroPrimo {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int y = input.nextInt();
		int p = 0;
		for(int j=0;j<y;j++){
			int x = input.nextInt();
			for(int i=1;i<=x;i++){
				if(x%i == 0){
					p++;
				}	
			}if(p > 2){
				System.out.println(x+" nao eh primo");
			}else{
				System.out.println(x+" eh primo");
			}
			p=0;
		}
	}
}
