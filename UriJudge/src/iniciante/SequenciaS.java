package iniciante;

public class SequenciaS {
	
	public static void main(String[] args) {
		double s = 0;
		for(int i = 1; i <=100 ;i++){
			
			s += 1/(double)i;
			
		}
		System.out.printf("%.2f\n",s);
	
	}

}
