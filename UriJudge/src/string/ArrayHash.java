package string;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ArrayHash {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int casos = Integer.parseInt(input.readLine());
		int j,i,t,total=0,linhas=0;
		String leitura,saida;
		for(i=0; i<casos; i++){
			linhas = Integer.parseInt(input.readLine());
			total = 0;
			for(j=0; j<linhas; j++){
				leitura = input.readLine();
				for(t=0; t<leitura.length(); t++){
					total += (((leitura.charAt(t)) - 'A') + j + t);
				}
			}
			saida = Integer.toString(total);
			output.write(saida.toString());
        	output.write("\n");
        	output.flush();
		}
	}
}
