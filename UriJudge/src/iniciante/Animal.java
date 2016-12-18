package iniciante;

import java.util.Scanner;

public class Animal {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		String r = s.next();
		String e = s.next();
		String t = s.next();

		if ((r.equals("vertebrado")) && (e.equals("ave"))) {
			if ((t.equals("onivoro"))) {
				System.out.println("pomba");
			} else if((t.equals("carnivoro"))) {
				System.out.println("aguia");
			}
		} else if (((r.equals("vertebrado")) && (e.equals("mamifero")))) {
			if ((t.equals("herbivoro"))) {
				System.out.println("vaca");
			}else if((t.equals("onivoro"))){ 
				System.out.println("homem");
			}
		} else if ((r.equals("invertebrado")) && (e.equals("inseto"))) {
			if ((t.equals("herbivoro"))) {
				System.out.println("lagarta");
			} else if((t.equals("hematofago"))) {
				System.out.println("pulga");
			}
		} else if ((r.equals("invertebrado")) && (e.equals("anelideo"))) {
			if ((t.equals("onivoro"))) {
				System.out.println("minhoca");
			} else if((t.equals("hematofago"))){
				System.out.println("sanguessuga");
			}
		}

	}

}
