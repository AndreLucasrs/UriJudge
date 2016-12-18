package iniciante;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SelecaoVetorI {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		ArrayList<Double> vetor =  new ArrayList<>();
		double n;
		
		for(int i = 0 ; i < 100 ; i++){
			n = s.nextDouble();
			vetor.add(n);
			if(vetor.get(i)<=10){
				System.out.println("A["+i+"] = "+vetor.get(i));
			}
			
		}

	}

}
