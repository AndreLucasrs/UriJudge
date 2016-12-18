package iniciante;

import java.util.Scanner;

public class TempoJogoMinuto {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		int hi = s.nextInt();
		int mi= s.nextInt();
		int hf = s.nextInt();
		int mf = s.nextInt();
		
		if((hi>hf)||(mi>mf)){
			if((hi<hf)||(mi<hf)||(hi>hf)||(mi>mf)){
			int a=(60-mi)+mf;
			Math.abs(a);
			int b=(24-hi)+hf-1;
			Math.abs(b);
			if((b<0 )||((b==25)||(b==24))){
				System.out.println("O JOGO DUROU 0 HORA(S) E "+a+" MINUTO(S)");
			}else{
				System.out.println("O JOGO DUROU "+b+" HORA(S) E "+a+" MINUTO(S)");
			}
			}
		}else
		if((hf>hi)&&(mf>mi)){
			int c=mf-mi;
			Math.abs(c);			
			int d=hf-hi;
			Math.abs(d);
			System.out.println("O JOGO DUROU "+d+" HORA(S) E "+c+" MINUTO(S)");
			
		}else
		if(((hf == hi)&&(mf==mi))&&((hf==mf)&&(hi==mi))&&((hf==mi)&&(mf==hi))){
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}

	}

}
