package grafos;

//FULLSTACKOVERKILL
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ResgateQuedaLivre {
	public static class vertice {
		double x;
		double y;

		public vertice(double x, double y) {
			this.x = x;
			this.y = y;
		}

	}

	// FULLSTACKOVERKILL
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int h = Integer.parseInt(entrada.readLine());
		for (int k = 0; k < h; k++) {
			List<vertice> g = new ArrayList<vertice>();
			List<Double> peso = new ArrayList<Double>();
			List<Boolean> visitados = new ArrayList<Boolean>();
			int n = Integer.parseInt(entrada.readLine());
			// FULLSTACKOVERKILL

			for (int i = 0; i < n; i++) {
				peso.add(Double.MAX_VALUE);
				visitados.add(false);
				String[] aux = (entrada.readLine()).split(" ");
				g.add(new vertice(Integer.parseInt(aux[0]), Integer.parseInt(aux[1])));
			}
			peso.set(0, (double) 0);

			double T = 0;
			for (int t = 0; t < n; t++) {
				int i = 0;
				double min = Double.MAX_VALUE;
				for (int kk = 0; kk < n; kk++) {
				
					if (!visitados.get(kk) && peso.get(kk) < min) {
						min = peso.get(kk);
						i = kk;
					}
				}
				visitados.set(i, true);
				T = T + min;
				for (int kk = 0; kk < n; kk++) {
					if (!visitados.get(kk)) {
						double d = DistanciaDoisPontos(g.get(i), g.get(kk));
						if (d < peso.get(kk))
							peso.set(kk, d);
					}
				}
			}
			System.out.printf("%.2f\n", T);
		}

	}

	public static double DistanciaDoisPontos(vertice a, vertice b) {
		return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2)) / 100;
		// div  por 100 p metro
	}
}
//FULLSTACKOVERKILL
