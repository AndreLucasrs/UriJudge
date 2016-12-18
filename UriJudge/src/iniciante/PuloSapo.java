package iniciante;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class PuloSapo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pulo = input.nextInt();
		int numAltura = input.nextInt();
		int count = 0;
		ArrayList<Integer> canos = new ArrayList<>();
		for(int i = 0; i < numAltura;i++){
			canos.add(input.nextInt());
		}
		if(canos.size() > 2){
			if(canos.get(0)+pulo >= canos.get(1) && canos.get(0)-canos.get(1) < pulo){
				count++;
			}
			for(int i = 1 ;i < canos.size()-1;i++){
				if(canos.get(i)+pulo >= canos.get(i+1) || Math.abs(canos.get(i)-canos.get(i-1)) < pulo){
					count++;

				}
			}
		}else if(canos.get(0)+pulo >= canos.get(1) && canos.get(0)-canos.get(1) < pulo){
			count++;
			
		}
		if(count+1 == canos.size()){
			System.out.println("YOU WIN");
		}else {
			System.out.println("GAME OVER");
		}
		
	}

}
