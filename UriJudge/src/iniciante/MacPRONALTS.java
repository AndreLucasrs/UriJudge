package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class MacPRONALTS {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
		int n = input.nextInt();
		int x = 0,y = 0;
		double a = 0;
		for(int i = 0;i<n;i++){
			x = input.nextInt();
			y = input.nextInt();
			if(x == 1001){
				a += y*1.50;
			}else if( x == 1002){
				a += y*2.50;
			}else if(x == 1003){
				a+= y*3.50;
			}else if(x == 1004){
				a+= y*4.50;
			}else if(x == 1005){
				a+= y*5.50;
			}
		}
		System.out.printf("%.2f\n",a);

	}

}
