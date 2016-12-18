package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OndeEstãoMinhasChaves {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String aux[] = entrada.readLine().split(" ");
		int n = Integer.parseInt(aux[0]);
		int t= Integer.parseInt(aux[1]);
		String s = (" "+entrada.readLine()+" ");
		for (int i = 0; i < n; i++) {
			String auux =entrada.readLine();
			if(s.contains(" "+auux+" "))
			System.out.println("0");
			else{
				System.out.println("1");
				s=s+auux+" ";
			}
		}
	}
}

