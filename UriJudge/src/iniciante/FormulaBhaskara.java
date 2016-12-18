package iniciante;

import java.util.Locale;
import java.util.Scanner;
  
public class FormulaBhaskara {
  
	private static Scanner leitor;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        leitor = new Scanner(System.in);
        double A, B, C, DELTA, R1, R2;
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        if (A == 0) {
            System.out.println("Impossivel calcular");
        } else{
            DELTA = (B * B) - 4 * A * C;
            if (DELTA < 0) {
                System.out.println("Impossivel calcular");
            } else {
                R1 = (- B + Math.sqrt(DELTA)) / (2 * A);
                R2 = (- B - Math.sqrt(DELTA)) / (2 * A);
                System.out.printf("R1 = %.5f\n", R1);
                System.out.printf("R2 = %.5f\n", R2);
            }
        }
    }
}
