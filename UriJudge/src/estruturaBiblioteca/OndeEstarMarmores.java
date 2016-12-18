package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OndeEstarMarmores {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		int count =1;
		while(x > 0){
			String[] casos = input.readLine().split(" ");
			int marmore = Integer.parseInt(casos[0]);
			int chutes = Integer.parseInt(casos[1]);
			int resultado[] = new int[marmore];
			for(int i=0; i<marmore; i++){
				String[] cas = input.readLine().split(" ");
				int num = Integer.parseInt(cas[0]);
				resultado[i] = num;
			}
			Arrays.sort(resultado);
			for(int i=0; i<chutes; i++){
				String[] ent = input.readLine().split(" ");
				int chut = Integer.parseInt(ent[0]);
				if(i == 0){
					System.out.println("CASE# "+ count +":");
				}
				int achei = buscaby(resultado, chut);
				
				if(achei == -1){
					System.out.println(chut + " not found");
				}
				else if(achei != -1){
					if(chut == resultado[achei]){	
						System.out.println(chut + " found at " + (achei+1));
					}
				}
			}
			count++;
			if((marmore==0)&&(chutes==0)){
				break;
			}
		}
	}
	public static int buscaby(int[] array, int valor){
		int inicio = 0;
		int fim = array.length-1;
		while(inicio <= fim){
			int meio = (inicio+fim)/2;
			if(array[meio] == valor){
				if(meio==0 || (array[meio - 1] != array[meio]))
					return meio;
			}
			if(valor> array[meio]){
					inicio = meio+1;
			}
			else{
				fim = meio-1;
			}		
		}
		return -1;
	}
}