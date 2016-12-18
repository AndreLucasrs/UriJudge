package iniciante;

import java.util.Scanner;

class BemVindoInverno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
       
       if( ((t1>t2) && (t2<=t3)) || ((t1<t2) && (t2<t3) && ((t3-t2) >= (t2-t1))) || ( (t1==t2) && (t2<t3) ) || (t1>t2) && (t2>t3) && ((t3-t2) > (t2-t1)) ) {
           System.out.println(":)");
        }
        else if( ((t1<t2) && (t2>=t3)) || ((t1<t2) && (t2<t3) && ((t3-t2) < (t2-t1))) || (t1>t2) && (t2>t3) && ((t3-t2) <= (t2-t1)) || (t1==t2) && (t2>=t3) ){
                System.out.println(":(");
        } 
    }
}
