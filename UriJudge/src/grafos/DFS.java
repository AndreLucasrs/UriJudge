package grafos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//FULLSTACKOVERKILL
public class DFS {
	static int graph[][] = new int[20][20];
	static boolean disc[] = new boolean[20];
	static StringBuilder sb = new StringBuilder();
	//FULLSTACKOVERKILL
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(entrada.readLine());
		int v, e, c = 1;

		while (n > 0) {
			String[] xx = (entrada.readLine()).split(" ");
			v = Integer.parseInt(xx[0]);
			e = Integer.parseInt(xx[1]);

			graph = new int[20][20];
			disc = new boolean[20];

			while (e > 0) {
				String[] aux = (entrada.readLine()).split(" ");
				graph[Integer.parseInt(aux[0])][Integer.parseInt(aux[1])] = 1;
				e--;
			}

			sb.append("Caso " + c + ":\n");
			c++;
			dfs_runner(v);

			n--;
		}
		System.out.print(sb);
	}
	//FULLSTACKOVERKILL
	static boolean dfs(int v, int n, int s) {

		int i;
		boolean path = false;
		disc[v] = true;

		for (i = 0; i < n; i++) {
			if (graph[v][i] == 1) {

				path = true;

				if (!disc[i]) {
					sb.append(espace(s/2)+ v + "-" + i + " pathR(G," + i + ")\n");
					dfs(i, n, s + 2);
				} else 
					sb.append(espace(s/2) + v + "-" + i + "\n");
			}
		}
		return path;
	}
	//FULLSTACKOVERKILL
	static void dfs_runner(int v) {
		int i, ind = 0;

		while (true) {
			if (dfs(ind, v, 2))
				sb.append("\n");

			ind = -1;

			for (i = 0; i < v; i++) {
				if (!disc[i]) {
					ind = i;
					break;
				}
			}

			if (ind == -1)
				break;
		}
	}
	//FULLSTACKOVERKILL
	public static String espace(int x) {
		String s = "";
		for (int i = 0; i < x; i++) {
			s += "  ";
		}
		return s;

	}
}