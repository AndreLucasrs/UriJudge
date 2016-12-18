package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Og{
	public static void main (String[] args) throws IOException {
	     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	     while(true){
			String casos[] = input.readLine().split(" ");
	        if(Integer.parseInt(casos[0]) == 0 && Integer.parseInt(casos[1]) == 0){
	            break;
	        }
	        int total = Integer.parseInt(casos[0]) + Integer.parseInt(casos[1]); 
	        System.out.println(total);
	     } 
	}
}
