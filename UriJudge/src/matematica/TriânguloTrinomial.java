package matematica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriânguloTrinomial {
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(entrada.readLine());
		System.out.println((long)Math.pow(3, n));
	}
}
