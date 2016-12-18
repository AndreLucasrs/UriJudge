package iniciante;

import java.util.Scanner;

public class PreenchimentodeVetorIV {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		 int a, p, i, b;
		    
		    int par[] = new int[5];
		    int impar[]=new int[5];
		    
		    p = 0;
		    i = 0;
		    
		    for(int j = 0; j < 15; j++){
		            a = input.nextInt();
		            if(a%2 == 0){
		                    par[p] = a;
		                    p++;
		            }else{
		                  impar[i] = a;
		                  i++;
		            }
		            
		            if(p == 5){
		                 b = 0;
		                 while(b != 5){ 
		                	 System.out.println("par["+b+"] = "+par[b]);
		                	 b++;
		                 }
		                 p = 0;
		            }
		            if(i == 5){
		                 b = 0;
		                 while(b != 5){
		                	 System.out.println("impar["+b+"] = "+impar[b]);
		                	 b++;
		                }
		                 i = 0;
		            }
		            if(j == 14){
		                 b = 0;
		                 while(b < i){ 
		                	 System.out.println("impar["+b+"] = "+impar[b]); 
		                	 b++;
		                }
		                 b = 0;
		                 while(b < p){
		                	 System.out.println("par["+b+"] = "+par[b]); 
		                	 b++;
		                }
		            }
		                 
		    }

	}

}
