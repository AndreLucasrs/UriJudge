package iniciante;

public class SequenciaIJ4 {

	public static void main(String[] args) {

		int i;

		for (i = 0; i <= 20; i += 2) {
			if (i == 0 || i == 10 || i == 20) {
				System.out.printf("I=%.0f J=%.0f\n", (double) i / 10,(double) i / 10 + 1);
				System.out.printf("I=%.0f J=%.0f\n", (double) i / 10,(double) i / 10 + 2);
				System.out.printf("I=%.0f J=%.0f\n", (double) i / 10,(double) i / 10 + 3);
				
			} else {
				System.out.printf("I=%.1f J=%.1f\n", (double) i / 10,(double) i / 10 + 1);
				System.out.printf("I=%.1f J=%.1f\n", (double) i / 10,(double) i / 10 + 2);
				System.out.printf("I=%.1f J=%.1f\n", (double) i / 10,(double) i / 10 + 3);
				
			}
		}
	}

}
