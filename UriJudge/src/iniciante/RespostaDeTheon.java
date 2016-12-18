package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RespostaDeTheon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numeros = input.nextInt();
		ArrayList<Integer> got = new ArrayList<>();
		for(int i = 0; i < numeros;i++){
			got.add(input.nextInt());
		}
		int a = Collections.min(got);
		System.out.println(got.indexOf(a)+1);
	}

}
