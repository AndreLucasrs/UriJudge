package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class IdadeDias {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		int x = input.nextInt();
		
		int ano = x/365;
		int meses =(x-(ano*365))/30;
		int dia = x-(ano*365)-(meses*30);
		
		System.out.println(ano+" ano(s)");
		System.out.println(meses+" mes(es)");
		System.out.println(dia+" dia(s)");

	}

}
