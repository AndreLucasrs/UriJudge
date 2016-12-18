package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		s.useLocale(Locale.US);
		int n = s.nextInt();
		int rato =0,sapo = 0, coelho =0;
		int sr = 0,ss = 0, sc = 0;
		int total;
		for(int i = 0;i < n;i++){
			
			int x = s.nextInt();
			String y = s.next();
			if(y.equals("C")){
				coelho = x;
				sc = sc + coelho;
			}else if(y.equals("R")){
				rato = x;
				sr = rato + sr;
			}else if(y.equals("S")){
				sapo = x;
				ss = sapo + ss;
			}
			
		}
		
		total = sr+sc+ss;
		
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+sc);
		System.out.println("Total de ratos: "+sr);
		System.out.println("Total de sapos: "+ss);
		
		double scc = sc;
		double srr = sr;
		double sss = ss;
		double total1 = total;
		double pc = (scc / total1)*100;
		double pr = (srr/total)*100;
		double ps = (sss/total)*100;
		
		System.out.printf("Percentual de coelhos: %.2f",pc);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f",pr);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f",ps);
		System.out.println(" %");
		

	}

}
