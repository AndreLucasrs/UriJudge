package iniciante;

import java.util.Scanner;

public class Hohoho {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 1; i <=n;i++){
			if(i < n){
				System.out.print("Ho ");
			}
			if(i == n){
				System.out.println("Ho!");
			}
		}

	}

}
