package grafos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//FULLSTACKOVERKILL
public class DuduFazServivo {
	static Integer white = 0; 
	static Integer grey = 1;
	static Integer black = 2;
	static List<Integer> visitados;
	static List<Integer> color;
	static List<List<Integer>> g;
//FULLSTACKOVERKILL
	static boolean dfs(int u) {

		color.set(u, grey);

		for (int i = 0; i < g.get(u).size(); i++) {
			int v = g.get(u).get(i);
			if (color.get(v) == white) {
				if (!dfs(v)) {
					return false;
				}
			} else if (color.get(v) == grey) {
				return false;
			}
		}
		color.set(u, black);
		return true;
	}
//FULLSTACKOVERKILL
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int h = Integer.parseInt(entrada.readLine());
		for (int k = 0; k < h; k++) {

			String[] n = (entrada.readLine()).split(" ");
			visitados = new ArrayList<Integer>(Collections.nCopies(100000, -1));
			color = new ArrayList<Integer>(Collections.nCopies(100000, white));
			g = new ArrayList<List<Integer>>();

			for (int i = 0; i < 100000; i++) {
				g.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < Integer.parseInt(n[1]); i++) {

				String[] aux = (entrada.readLine()).split(" ");
				g.get(Integer.parseInt(aux[0])).add(Integer.parseInt(aux[1]));
				visitados.set(Integer.parseInt(aux[0]), 0);

			}
			boolean a = true;
			for (int i = 0; i < 100000; i++) {
				if (visitados.get(i) != -1) {
					if (!dfs(i)) {
						a = false;
						break;
					}
				}
			}

			if (a)
				System.out.println("NAO");
			else
				System.out.println("SIM");
		}
//FULLSTACKOVERKILL
	}

}
//FULLSTACKOVERKILL