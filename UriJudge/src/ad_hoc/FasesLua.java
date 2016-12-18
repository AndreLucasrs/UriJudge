package ad_hoc;

import java.util.Scanner;
import java.lang.Math;
class FasesLua {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int anterior = input.nextInt();
        int atual = input.nextInt();
        
       
        if(atual >= 0 && atual <= 2 ){
		    System.out.println("nova");
		}
		else if(atual < anterior && atual <= 96){
		    System.out.println("minguante");
		}
		else if(atual >= 3 && atual <= 96){
		    System.out.println("crescente");
		}
		else if(atual >= 97 && atual <=100){
		    System.out.println("cheia");
		} 


    }

}
