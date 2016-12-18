package paradigma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixFlags {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int m[] = new int[601];
		int supers[] = new int[101];
		int max[] = new int[101];
		int count = 1;
		String s[] = input.readLine().split(" ");
		int atracao = Integer.parseInt(s[0]);
		int t = Integer.parseInt(s[1]);
		while (atracao > 0){
			if(atracao == 0){
				break;
			}
			int dura[] = new int[101];
			int ponto[] = new int[101];
			for(int i=0; i<atracao; i++){
				String s1[] = input.readLine().split(" ");
				int duracao = Integer.parseInt(s1[0]);
				int pontuacao = Integer.parseInt(s1[1]);
				dura[i] = duracao;
				ponto[i] = pontuacao;
    		}
			m[0] = 0;
			for(int w=1; w<=t; w++){
				for(int i=0; i<atracao; i++){
					if(w >= dura[i]){
						supers[i] = m[w - dura[i]];
					}
					else{
						supers[i] = 0;
					}
				}
				for(int i=0; i<atracao; i++){
					if(w >= dura[i]){
						max[i] = supers[i] + ponto[i];
					}
					else{
						max[i] = 0;
					}
				}
				m[w] = max[0];
				for(int i=1; i<atracao; i++){
					if(max[i] > m[w]){
						m[w] = max[i];
					}
				}
			}
			System.out.println("Instancia " + count++ + "\n"+ m[t] + "\n");
			s = input.readLine().split(" ");
			atracao = Integer.parseInt(s[0]);
			t = Integer.parseInt(s[1]);
		}
	}
}
