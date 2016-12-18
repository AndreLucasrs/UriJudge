package iniciante;

import java.util.Scanner;
import java.util.Locale;

class AreaSuperior{
      
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int c = 1;
        String o = input.next();
        double s = 0.0;
        
        for(int i = 0; i < 5 ; i++){
            
            for(int j = 0; j < 12; j++){
                double n = input.nextDouble();
                if(j >= c && j <= 11 - c){
                    s += n;
                }
            }
           c++;
        }
        if(o.equals("S")){
            System.out.printf("%.1f\n", s);
        }
        else{
            s = (double) s/30.0;
            System.out.printf("%.1f\n", s);
        }
    
    }
  
}
