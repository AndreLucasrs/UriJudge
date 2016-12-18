package iniciante;

import java.util.Scanner;

public class SequenciaLogica {
	
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner (System.in);
		
		int n = s.nextInt();
		for(int i = 1; i <=n ; i ++ ){
			
			
			System.out.println((i)+" "+(i*i)+" "+(i*i*i));
			System.out.println((i)+" "+(i*i+1)+" "+(i*i*i+1));
			
		}
	}
}
