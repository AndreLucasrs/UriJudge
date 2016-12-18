package ad_hoc;

import java.util.Scanner;

class AlarmeDespertador {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       while(true){
           int h1 = in.nextInt();
           int m1 = in.nextInt();
           int h2 = in.nextInt();
           int m2 = in.nextInt();
           int res=0;
           int a=0;
           if(h1 == 0 && m1 == 0 && h2 ==0 && m2 ==0){
               break;
           }
           if(h1 == h2 && m1 == m2){
               res = 1440;
           }
           else if ( m2>m1 && h1==h2 ){
               res = m2-m1;
           }
           else{
               if (m1>m2 && h1==h2 ){
                   res = 1440-(m1-m2);
               }
               else{          
                  if ( h1>h2 ){
                       res = (h1-h2)*60;
                       res = 1440-res;
                           if ( m1>m2 ){
                                res = res-(m1-m2);
                            }
                            else{
                               res = res + (m2-m1);
                           }
                  }
                  else{
                       res = (h2-h1)*60;
                       if ( m1>m2 ){
                          res = res - (m1-m2);
                       }
                       else{
                           res = res + (m2-m1);
                       }
                   }
                   
               }
               
           }
           System.out.println(res);
           
       }

   }

}
