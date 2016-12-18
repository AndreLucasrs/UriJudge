package iniciante;

import java.util.Scanner;

public class Maior {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		//System.out.println("a");
		int a = input.nextInt();
		//System.out.println("b");
		int b = input.nextInt();
		//System.out.println("c");
		int c = input.nextInt();
		
		int d = (a + c + Math.abs(a-c))/2 ;
		d = (d + b + Math.abs(d-b))/2;
		System.out.println(d + " eh o maior");
		
		/*
		if( a > b){
			if(b > c){
				System.out.println(a +" eh o 1maior");
			}
		}else if(c > b){
			if(c > a){
				System.out.println(c +" eh o maior");
			}
			
		 }else{
			 System.out.println(b +" eh o maior");
		 }
	*/
	}
}

