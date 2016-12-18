package paradigma;

import java.util.Scanner;

public class Comercio_Vinho {

	private static Scanner input;

	public static void main(String[] args) {
		long c, t;
		long d[] = new long[1000001];
		input = new Scanner(System.in);
		long a = input.nextLong();
		while (a != 1) {
			if (a == 0) {
				break;
			}
			for (c = 0; c < a; c++) {
				d[(int) c] = input.nextLong();
			
			}
			t = 0;
			for (c = 1; c < a; c++) {
				if (d[(int) (c - 1)] < 0) {
					t = t + (-1) * d[(int) (c - 1)];
				} else {
					t += d[(int) (c - 1)];
					
				}
				d[(int) c] += d[(int) (c - 1)];
				
			}
			System.out.println(t);
		}
	}

}


/*

#include <stdio.h>
int main (){
   int a, c, v, d[100001], t;
   while (1){
      scanf ("%d", &a);
      if (a==0){
         break;
      }
      for (c=0; c<a; c++){
            scanf ("%d", &d[c]);
      }
      t=0;
      for (c=1; c<a; c++){
         if (d[c-1]<0){
               t=t+(-1)*d[c-1];
         }
         else {
               t+=d[c-1];
         }
         d[c]+=d[c-1];
      }
      printf ("%d\n", t);
      }
   }
   

*/