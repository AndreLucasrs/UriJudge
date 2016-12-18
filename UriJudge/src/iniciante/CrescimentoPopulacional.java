package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		int nTeste = input.nextInt();
		double tempoA = 0 ;
		double tempoB = 0 ;
		for(int i=0;i < nTeste ;i++){
			int count = 0;
			int pa = input.nextInt();
			int pb = input.nextInt();
			double cpA = input.nextDouble();
			double cpB = input.nextDouble();
			
			tempoA = cpA/100;
			tempoB = cpB/100;
			while(pa <= pb){
				pa =(int) (pa*tempoA)+pa;
				pb =(int) (pb*tempoB)+pb;
				
				count++;
			}
			if(count <= 100){
				System.out.println(count +" anos.");
			}
			if(count > 100){
				System.out.println("Mais de 1 seculo.");
			}
	             
		}

	}

}
