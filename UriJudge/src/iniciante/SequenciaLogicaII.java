package iniciante;

import java.util.Scanner;

public class SequenciaLogicaII {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int i = 0, j =0;
		
		for(i = 1; i <= y;i++ ){
			j ++;
            System.out.print(i+" ");
            if(j == x-1){
                i++;
                System.out.println(i+"");
                j = 0;
            }    
		} 

	}

}
