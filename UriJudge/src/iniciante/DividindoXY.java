package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class DividindoXY {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		int n = s.nextInt();
		
		for(int i = 0;i < n;i++){
			double x = s.nextDouble();
			double y = s.nextDouble();
			
			if(y == 0){
				System.out.println("divisao impossivel");
			}else{
				x = x/y;
				System.out.println(x);
			}
		}
		
	}

}
