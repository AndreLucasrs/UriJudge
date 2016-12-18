package iniciante;

import java.util.Scanner;

public class TempoEvento {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int di,hi,mi,si; 
		int df,hf,mf,sf;
		int dia,hora,minuto,segundo;
		String inicio,fim,dya,fym;
		
		dya = s.nextLine();
		//di = s.nextInt();
		inicio = s.nextLine();
		//df = s.nextInt();
		fym = s.nextLine();
		fim = s.nextLine();
		
		
		di = Integer.parseInt(dya.substring(4));
		hi = Integer.parseInt(inicio.substring(0, 2));
		mi = Integer.parseInt(inicio.substring(5, 7));
		si = Integer.parseInt(inicio.substring(10, 12));
		df = Integer.parseInt(fym.substring(4));
		hf = Integer.parseInt(fim.substring(0, 2));
		mf = Integer.parseInt(fim.substring(5, 7));
		sf = Integer.parseInt(fim.substring(10, 12));
		
		
		segundo = sf - si;
		minuto = mf - mi;
		hora = hf - hi;
		dia = df - di;
		
		if(segundo < 0){
			segundo += 60;
			minuto--;
		}
		if(minuto < 0){
			minuto+=60;
			hora--;
		}
		if(hora < 0){
			hora+=24;
			dia--;
		}
		System.out.println(dia+" dia(s)");
		System.out.println(hora+" hora(s)");
		System.out.println(minuto+" minuto(s)");
		System.out.println(segundo+" segundo(s)");
	}

}
