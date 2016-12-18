package iniciante;

import java.util.Scanner;

class PedraPapelAtaqueAereo{
  public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
      
    int entrada = input.nextInt();
    
    for (int i = 0; i < entrada ; i++){
        String caso1 = input.next();
        String caso2 = input.next();
        
        if(caso1.equals("ataque") && caso2.equals("pedra")){
            System.out.println("Jogador 1 venceu");
        }
        else if(caso2.equals("ataque") && caso1.equals("pedra")){
            System.out.println("Jogador 2 venceu");
        }
        else if(caso1.equals("pedra") && caso2.equals("papel")){
            System.out.println("Jogador 1 venceu");
        }
        else if(caso2.equals("pedra") && caso1.equals("papel")){
            System.out.println("Jogador 2 venceu");
        }
        else if(caso1.equals("papel") && caso2.equals("papel")){
            System.out.println("Ambos venceram");
        }
        else if(caso1.equals("pedra") && caso2.equals("pedra")){
            System.out.println("Sem ganhador");
        }
        else if(caso1.equals("ataque") && caso2.equals("ataque")){
            System.out.println("Aniquilacao mutua");
        }
        else if(caso1.equals("ataque") && caso2.equals("papel")){
            System.out.println("Jogador 1 venceu");
        }
        else if(caso2.equals("ataque") && caso1.equals("papel")){
            System.out.println("Jogador 2 venceu");
        }
        
    }    
    
    
  }
}
