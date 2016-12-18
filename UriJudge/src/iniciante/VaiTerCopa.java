package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class VaiTerCopa {

	//private static Scanner s;
	public static void main(String[] args) throws IOException {
		//s = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String n;
		
		while((n = input.readLine()) != null && n.length() != 0 ){
			if( n.equals("0") ){
				System.out.println("vai ter copa!");
			}else if(!n.equals("0")){
				System.out.println("vai ter duas!");
			}
			
		}

	}

}
