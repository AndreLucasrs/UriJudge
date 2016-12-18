package iniciante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {

	private static Scanner leitor;
	
	public static void main(String[] args) {
		
		/*
		ArrayList<Integer> sorts = new ArrayList<Integer> ();
		s = new Scanner(System.in);
		
		int a,b,c,d;
		sorts.add(a = s.nextInt());
		sorts.add(b = s.nextInt());
		sorts.add(c = s.nextInt());
		sorts.add(d = s.nextInt());
		
		Arrays.sort(sorts.toArray());

		System.out.println(sorts);
		*/
		
		leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        //ler os valores e ap�s fazer testes para coloc�-los em ordem crescente
        if ((a<b) && (b<c)){
            System.out.println("" + a);
            System.out.println("" + b);
            System.out.println("" + c);
        }else
            if ((a<c) && (c<b)){
                System.out.println("" + a);
                System.out.println("" + c);
                System.out.println("" + b);
            }else
                if ((b<a)&&(a<c)) {
                    System.out.println("" + b);
                    System.out.println("" + a);
                    System.out.println("" + c);
                }else
                    if ((b<c) && (c<a)) {
                        System.out.println(""+ b);
                        System.out.println("" + c);
                        System.out.println("" + a);
                    }else
                        if ((c<a)&&(a<b)) {
                            System.out.println("" + c);
                            System.out.println("" + a);
                            System.out.println("" + b);
                        }else
                            if ((c<b)&&(c<a)) {
                                System.out.println(""+ c);
                                System.out.println(""+ b);
                                System.out.println("" + a);
                            }
        System.out.println();
        //imprimir a linha em branco
        System.out.println("" + a);
        System.out.println("" + b);
        System.out.println("" + c);
        //imprimir os valores na ordem que foram lidos
		
	}

}
