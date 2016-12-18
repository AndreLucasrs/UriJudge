package ad_hoc;

import java.util.Scanner;

class Feedback {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        for(int i = 0; i<entrada; i++){
            int feed = input.nextInt();
            for(int y = 0; y < feed; y++){
                int reclamacao = input.nextInt();
                if(reclamacao == 1){
                    System.out.println("Rolien");
                }
                else if(reclamacao == 2){
                    System.out.println("Naej");
                }
                else if(reclamacao == 3){
                    System.out.println("Elehcim");
                }
                else if(reclamacao == 4){
                    System.out.println("Odranoel");
                }
            }
        }
        

    }

}
