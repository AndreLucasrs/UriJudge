package iniciante;

import java.util.Scanner;

public class TempoJogo {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		int hi = s.nextInt();
		int hf = s.nextInt();
		
		if(hi>hf){
			hf=(24-hi)+hf;
			Math.abs(hf);
			System.out.println("O JOGO DUROU "+hf+" HORA(S)");
		}else if(hf>hi){
			hf=hf-hi;
			Math.abs(hf);
			System.out.println("O JOGO DUROU "+hf+" HORA(S)");
		}else if(hf == hi){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

	}

}
