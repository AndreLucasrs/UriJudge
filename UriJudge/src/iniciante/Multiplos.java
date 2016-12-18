package iniciante;
import java.util.Scanner;

public class Multiplos {

	private static Scanner scan;
	public static void main(String[] args) {
		      scan = new Scanner(System.in);
		      
		      int aux;      
		      int a = scan.nextInt();
		      int b = scan.nextInt();  
		      
		      if(b>a){
		    	  aux = a;
		    	  a = b;
		    	  b = aux;
		      }
		      if ((a%b == 0))
		         System.out.printf("Sao Multiplos\n");
		      else
		         System.out.printf("Nao sao Multiplos\n");

	}

}

