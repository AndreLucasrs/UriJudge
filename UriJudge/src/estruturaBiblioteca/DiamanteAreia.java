package estruturaBiblioteca;

import java.util.Scanner;

public class DiamanteAreia {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = input.nextInt();
		String x;
		int p,s;
		for (int i = 0; i < n; i++) {
			x = input.next();
			p= 0;
			s= 0;
			for (int j = 0; j < x.length(); j++) {
				if(x.charAt(j) == '<'){
					p++;
				}else if(x.charAt(j) == '>' && p - 1 >= 0){
						p--;
						s++;
				}
								
			}
			System.out.println(s);
			
		}

	}

}
