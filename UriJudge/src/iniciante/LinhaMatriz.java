package iniciante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LinhaMatriz {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int y = 0;
		int i = 0;
		//ArrayList<ArrayList<Integer>> listas = new ArrayList<ArrayList<Integer>>();
		//Map<Integer,Integer>lista = new HashMap<>();
		List<Integer>lista = new ArrayList<>();
		//int [][] lista = new int [12][12] ;
		
		for(i =0; i<12;i++){
			for(y = 0;y<12;y++){
				//lista[i][y] = y;
				//lista.put(i, y);
				lista.add(y);
				//System.out.println(lista);
				//System.out.println(lista.hashCode());
			}
			
		}
		
		
		for(i =0; i<12;i++){
			for(y = 0;y<12;y++){
				System.out.print(lista.indexOf(11));
				System.out.println();
			}
			
		}	
		

	}
}
