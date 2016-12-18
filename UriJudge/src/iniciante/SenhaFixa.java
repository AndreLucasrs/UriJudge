package iniciante;

import java.util.Scanner;

public class SenhaFixa {

	private static Scanner a;
	public static void main(String[] args) {
		a = new Scanner(System.in);
		int senha;
		while((senha = a.nextInt()) != 2002){
			System.out.println("Senha Invalida");
		}
		if(senha == 2002){
			System.out.println("Acesso Permitido");
		}

	}

}
