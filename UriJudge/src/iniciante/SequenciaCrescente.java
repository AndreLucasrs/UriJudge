package iniciante;

import java.util.Scanner;

public class SequenciaCrescente {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		while(true){
			int n = input.nextInt();
			if(n == 0){
				break;
			}
			for(int i = 1;i <=n;i++){
				
				if(i < n){
					System.out.print(i+" ");
				}else if ( i == n){
					System.out.println(i);
				}
			}
		}
		

	}

}
