package iniciante;

import java.util.Scanner;

class OEscolhido {
    public static void main (String[] args) {
        
        Scanner s = new Scanner(System.in);
        int alunos = s.nextInt();
        int mE=0; 
        double nE=0;
        for(int i=0; i<alunos; i++){
            int mat = s.nextInt();
            double nota = s.nextDouble();
            
            if(nE < nota){
                mE = mat;
                nE = nota;
            }
        }
        if(nE < 8){
            System.out.println("Minimum note not reached");
        }
        else{
            System.out.println(mE);
        }
        
    }
} 
