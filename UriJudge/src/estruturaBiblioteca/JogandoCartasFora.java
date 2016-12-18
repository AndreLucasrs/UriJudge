package estruturaBiblioteca;

import java.util.Scanner;
import java.util.Stack;
public class JogandoCartasFora {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 1;
		while((x = input.nextInt())!=0){
			Stack<Integer> pilha = new Stack<>();
			for (int i = 1; i <= x; i++) {
				pilha.push(i);
			}
			System.out.printf("Discarded cards: ");
			for(int i = 0; i < x-1;i++) {
				if (i == x - 2) {
					System.out.println(pilha.get(0));
				} else {
					System.out.print(pilha.get(0) + ", ");
				}
                pilha.remove(0);
        		pilha.push(pilha.firstElement());
        		pilha.remove(pilha.firstElement());
			}
			System.out.printf("Remaining card: %d\n",pilha.firstElement());
		}
	}
}
