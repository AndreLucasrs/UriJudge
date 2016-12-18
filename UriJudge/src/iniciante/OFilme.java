package iniciante;

import java.util.Scanner;
import java.util.Locale;
  
class OFilme{
      
    private static Scanner input;
      
    public static void main(String[] args) {
              
            input = new Scanner(System.in);
            input.useLocale(Locale.US);
            double valor = input.nextDouble();
            double valorA = input.nextDouble();
            
            double total = (valorA/valor * 100) -100; 
            System.out.printf("%.2f%%\n", total ); 
            
        }
  
}
