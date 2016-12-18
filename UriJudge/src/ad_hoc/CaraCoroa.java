package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CaraCoroa {
	public static void main (String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
		    int qtd = Integer.parseInt(input.readLine());
		    if(qtd == 0){
		        break;
		    }
		    int mary=0;
		    int john=0;
		    String casos[] = input.readLine().split(" ");
		    for(int i=0; i<qtd; i++){
		        if(Integer.parseInt(casos[i]) == 0 ){
		            mary++;
		        }
		        else{
		            john++;
		        }
		    }
		    System.out.println("Mary won " + mary + " times and John won " + john + " times");
		}
	}
}
