package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TabelaHash {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int entrada = Integer.parseInt(input.readLine());
		for(int i=0;i<entrada;i++){
			String[] casos = input.readLine().split(" ");
			int dispercao = Integer.parseInt(casos[0]);
			int[] tamanho = new int[Integer.parseInt(casos[1])];
			String[] valo = input.readLine().split(" ");
			
			for(int j=0; j<tamanho.length; j++){
				tamanho[j]=Integer.parseInt(valo[j]);
			}
			LinkedList<Integer> [] saida = new LinkedList[dispercao];
			for(int j=0;j<tamanho.length;j++){
				if(saida[tamanho[j]%dispercao] == null){
					saida[tamanho[j]%dispercao] = new LinkedList<Integer>();
					saida[tamanho[j]%dispercao].add(tamanho[j]);
				}
				else{
					saida[tamanho[j]%dispercao].addLast(tamanho[j]);
				}
			}
			for(int j=0; j<dispercao; j++){
				if(saida[j] == null){
					System.out.println(j + " -> \\");
				}
				else{
					System.out.printf(j +" -> ");
					for(int y=0; y<saida[j].size(); y++){
						System.out.printf( saida[j].get(y) + " -> ");
					}
					System.out.println("\\");
				}
			}
			if(i < entrada-1){
			    System.out.println();
			}
		}
	}

}
