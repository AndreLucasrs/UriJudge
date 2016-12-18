package JuizOnline;

import java.util.Scanner;

public class Valores {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		//do{
			
			 if((b>c) && (d>a) && ((c+d)>(a+b)) && (c>0) && (d>0) && (a%2==0)){
			        System.out.println("Valores aceitos");
			 }else{
			        System.out.println("Valores nao aceitos");
			}
		//}while ((a!=b) && (b!=c) && (c!=d));
			
	}

}
