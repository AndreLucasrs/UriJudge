package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalançoParametro1 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int c;
		String s;
		while ((s = input.readLine()) != null) {
			c = 0;
			for (int i = 0; i < s.length(); ++i) {
				if (s.charAt(i) == ')') {
					c--;
				} else if (s.charAt(i) == '(') {
					c++;
				}

				if (c < 0) {
					break;
				}
			}
			if (c == 0) {
				System.out.println("correct");
			} else {
				System.out.println("incorrect");
			}
		}

	}

}
