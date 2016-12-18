package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DomingoManha {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		
		while((entrada = input.readLine())!= null){
			String[] teste = entrada.split(":");
			int a = Integer.parseInt(teste[0]);
			int b = Integer.parseInt(teste[1]);
			
			if(a < 7 ){
				System.out.println("Atraso maximo: 0");
				
			}else if(a == 7 && b == 00){
				System.out.println("Atraso maximo: 0");
			}else{
				if(a <= 7 && b > 00){
					System.out.println("Atraso maximo: "+b);
				}else if( a >= 8){
					int d =  a-7;
					int c = 60*d+b;
					System.out.println("Atraso maximo: "+c);
				}
			}
		}

	}

}
