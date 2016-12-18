package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner (System.in);
		s.useLocale(Locale.US);
		
		double n1 = s.nextDouble();
		double n2 = s.nextDouble();
		double n3 = s.nextDouble();
		double n4 = s.nextDouble();
		double media;
		
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*4;
		n4 = n4*1;
		media = (n1+n2+n3+n4)/10;
		
		System.out.printf("Media: %.1f\n",media);
		
		if(media >= 7.0){
			System.out.println("Aluno Aprovado");
		}else if( media < 5.0){
			System.out.println("Aluno Reprovado");
		}
		if(media >= 5.0 && media <= 6.9){
			double exame = s.nextDouble();
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f\n",exame);
			media = (media + exame)/2;
			if(media >=5.0){
				System.out.println("Aluno aprovado.");
			}else{
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n",media);
		}
		
		/*
		 * import java.util.Scanner;
		import java.text.DecimalFormat;

	public class ex1040_media3 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double N1, N2, N3, N4;
		double MEDIA, EXAME;

		N1 = input.nextDouble();
		N2 = input.nextDouble();
		N3 = input.nextDouble();
		N4 = input.nextDouble();

		MEDIA = (N1*2 + N2*3 + N3*4 + N4*1)/10;

		System.out.println("Media: " + df.format(MEDIA));

		if (MEDIA >= 7) {
			System.out.println("Aluno aprovado.");
		}
		else if (MEDIA < 5) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			EXAME = input.nextDouble();
			System.out.println("Nota do exame: " + df.format(EXAME));
			System.out.println("Aluno aprovado.");
			System.out.println("Media final: " + df.format((EXAME + MEDIA)/2));
		}

    }
}
		 */

	}

}
