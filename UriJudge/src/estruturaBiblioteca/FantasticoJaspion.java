package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FantasticoJaspion {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int estancia = Integer.parseInt(input.readLine());
		for (int i = 0; i < estancia; i++) {
			String[] casos = input.readLine().split(" ");
			int palavras = Integer.parseInt(casos[0]);
			int linhas = Integer.parseInt(casos[1]);
			Map<String, String> traducao = new HashMap<String, String>();
			for (int j = 0; j < palavras; j++) {
				String japones = input.readLine();
				String ptbr = input.readLine();
				traducao.put(japones, ptbr);

			}

			for (int y = 0; y < linhas; y++) {
				String[] comparacao = input.readLine().split(" ");
				if (comparacao.length == 0) {
					System.out.println();
				}
				for (int v = 0; v < comparacao.length; v++) {
					
					if (traducao.containsKey(comparacao[v]) && v == comparacao.length - 1) {
						System.out.print(traducao.get(comparacao[v]));

					} 
					else if (traducao.containsKey(comparacao[v])) {
						System.out.print(traducao.get(comparacao[v]) + " ");
					}
					else {
						if (v == comparacao.length - 1) {
							System.out.print(comparacao[v]);
						} 
						else {
							System.out.print(comparacao[v] + " ");
						}
					}

				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
