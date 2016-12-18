package iniciante;

import java.util.Scanner;

public class Bazinga {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 0;
		for(i = 1; i <= n;i++){
			String a = input.next();//Sheldon
			String b = input.next();//Raj
			
			if(a.equalsIgnoreCase(b)){
				System.out.println("Caso #"+i+": De novo!");
			}
			
				if(a.equalsIgnoreCase("pedra")){
					if(b.equalsIgnoreCase("tesoura")||b.equalsIgnoreCase("lagarto")){
						System.out.println("Caso #"+i+": Bazinga!");
					}else if(b.equalsIgnoreCase("papel")||b.equalsIgnoreCase("spock")){
						System.out.println("Caso #"+i+": Raj trapaceou!");
					}
				}else if(a.equalsIgnoreCase("papel")){
					if(b.equalsIgnoreCase("pedra")||b.equalsIgnoreCase("spock")){
						System.out.println("Caso #"+i+": Bazinga!");
					}else if(b.equalsIgnoreCase("tesoura")||b.equalsIgnoreCase("lagarto")){
						System.out.println("Caso #"+i+": Raj trapaceou!");
					}
				}else if(a.equalsIgnoreCase("tesoura")){
					if(b.equalsIgnoreCase("papel")||b.equalsIgnoreCase("lagarto")){
						System.out.println("Caso #"+i+": Bazinga!");
					}else if(b.equalsIgnoreCase("pedra")||b.equalsIgnoreCase("spock")){
						System.out.println("Caso #"+i+": Raj trapaceou!");
					}
				}else if(a.equalsIgnoreCase("lagarto")){
					if(b.equalsIgnoreCase("spock")||b.equalsIgnoreCase("papel")){
						System.out.println("Caso #"+i+": Bazinga!");
					}else if(b.equalsIgnoreCase("pedra")||b.equalsIgnoreCase("tesoura")){
						System.out.println("Caso #"+i+": Raj trapaceou!");
					}
				}else if(a.equalsIgnoreCase("spock")){
					if(b.equalsIgnoreCase("tesoura")||b.equalsIgnoreCase("pedra")){
						System.out.println("Caso #"+i+": Bazinga!");
					}else if(b.equalsIgnoreCase("papel")||b.equalsIgnoreCase("lagarto")){
						System.out.println("Caso #"+i+": Raj trapaceou!");
					}
				}
			
		}

	}

}
