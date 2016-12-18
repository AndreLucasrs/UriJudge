package iniciante;
import java.util.Scanner;

public class NossosDiasNuncaVoltarao {

	public static void main(String[] args) {
		
		String x = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		String variavel = x.substring(0,i);
		System.out.println(variavel);

	}

}
