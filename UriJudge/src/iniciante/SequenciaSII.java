package iniciante;

public class SequenciaSII {

	public static void main(String[] args) {
		
		double s = 1.0, x = 2.0;
	    int i;
	    for (i = 3; i <= 39; i += 2){
	        s += (double) i / x;
	        x *= 2;
	    }
	    System.out.printf("%.2f\n", s);
	}
}
