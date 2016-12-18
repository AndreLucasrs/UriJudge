package iniciante;

import java.util.Scanner;

public class Grenais {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int g, i, gv = 0, iv = 0, e = 0, n = 0, r;
		    do {
		        i = input.nextInt();
		        g = input.nextInt();
		        n++;
		        if (i == g)
		            e++;
		        if (i > g)
		            iv++;
		        else
		            gv++;
		        System.out.println("Novo grenal (1-sim 2-nao)");
		        r = input.nextInt();
		    } while ( r == 1);
		    System.out.printf("%d grenais\n", n);
		    System.out.printf("Inter:%d\n", iv);
		    System.out.printf("Gremio:%d\n", gv);
		    System.out.printf("Empates:%d\n", e);
		    if (iv > gv)
		        System.out.printf("Inter venceu mais\n");
		    else if (gv > iv)
		        System.out.printf("Gremio venceu mais\n");
		    else
		        System.out.printf("Nao houve vencedor\n");
		    
		    /*
		     int x, y;
    int op;
    int inter = 0;
    int gremio = 0;
    int grenal = 0;
    int empate = 0;
    
    while(true){
                cin >> x;
                cin >> y;
                
                if(x > y) inter ++;
                if(x < y) gremio ++;
                if(x == y) empate++;
                grenal++;
                
                cout << "Novo grenal (1-sim 2-nao)\n";
                cin >> op;
                
                if(op == 2) break;
    }
    cout << grenal <<" grenais\n";
    cout << "Inter:" << inter << "\n";
    cout << "Gremio:" << gremio << "\n";
    cout << "Empates:" << empate << "\n";
    
    if(inter > gremio) cout << "Inter venceu mais\n";
    if(inter < gremio) cout << "Gremio venceu mais\n";
    if(inter == gremio) cout << "Nao houve vencedor\n";
		     */

	}

}
