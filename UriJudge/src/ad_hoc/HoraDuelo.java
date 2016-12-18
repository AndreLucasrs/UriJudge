package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class CartaPra{
	int a = 0;
	int d = 0;
	int h = 0;
}
public class HoraDuelo {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		CartaPra pras = new CartaPra();
		String casos[] = input.readLine().split(" ");
		int cartas = Integer.parseInt(casos[0]);
		pras.a = Integer.parseInt(casos[1]);
		pras.d = Integer.parseInt(casos[2]);
		pras.h = Integer.parseInt(casos[3]);
		
		CartaPra v = null; 
		CartaPra soma = new CartaPra();
		ArrayList<CartaPra> lista = new ArrayList<CartaPra>();
		
		for(int i=0; i<cartas; i++){
			v = new CartaPra();
			String s1[] = input.readLine().split(" ");
			int ataque = Integer.parseInt(s1[0]);
			int defesa = Integer.parseInt(s1[1]);
			int habilidade = Integer.parseInt(s1[2]);
			v.a = ataque;
			v.d = defesa;
			v.h = habilidade;
			
			lista.add(v);
		}
		if(backtrack(lista, pras, 0, 0, soma) == true){
			System.out.println("Y");
		}
		else{
			System.out.println("N");
		}

	}
	
	 public static boolean backtrack(ArrayList<CartaPra> lista, CartaPra p, int c, int i, CartaPra soma){
		 
		 if(i == lista.size()){
			if(c >= 2 && soma.a == p.a && soma.h == p.h && soma.d == p.d){
				return true;
			}
			else{
				return false;
			}
		}
		if(soma.a > p.a || soma.h > p.h || soma.d > p.d){
			return false;
		}
		
		soma.a += lista.get(i).a;
		soma.d += lista.get(i).d;
		soma.h += lista.get(i).h;
		
		boolean sv = backtrack(lista,p,c+1,i+1,soma);
		if(sv){
			return true;
		}
		soma.a -= lista.get(i).a;
		soma.d -= lista.get(i).d;
		soma.h -= lista.get(i).h;
		
		sv = backtrack(lista,p,c,i+1,soma);
		if(sv){
			return true;
		}
		return false;
	}
}
