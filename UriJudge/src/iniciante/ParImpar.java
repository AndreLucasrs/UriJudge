package iniciante;

import java.util.Scanner;

public class ParImpar {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int a = s.nextInt();
		int i;
		for(i = 0; i < a;i++){
			int n = s.nextInt();
			if(n % 2 == 0){
				if(n>0){
					System.out.println("EVEN POSITIVE");
				}else if(n == 0){
					System.out.println("NULL");
				}else{
					System.out.println("EVEN NEGATIVE");
				}
				
			}else if(n % 2 !=0){
				if(n>0){
					System.out.println("ODD POSITIVE");
				}else{
					System.out.println("ODD NEGATIVE");
				}
				
			}
		}
	}

}
