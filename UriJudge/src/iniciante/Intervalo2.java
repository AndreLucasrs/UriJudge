package iniciante;

import java.util.Scanner;

public class Intervalo2 {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner (System.in);
		
		int in = 0,out = 0;
		int n = s.nextInt();
		int x;
		
		for (int i = 0; i < n;i++){
			x = s.nextInt();
			
			if(x>=10 && x<=20){
				in++;
			}else{
				out++;
			}
			
		}
		System.out.println(in+" in");
		System.out.println(out+" out");

	}

}
