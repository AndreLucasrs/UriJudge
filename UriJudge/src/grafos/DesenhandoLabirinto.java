package grafos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//FULLSTACKOVERKILL
public class DesenhandoLabirinto {	
	static int cont =0;
	static void dfs(List<List<Integer>> g, int v){
	
	    int white = 0; //vértice não processado
	    int grey = 1; //vértice em processamento
	    int black = 2; // vértice processado

	    List<Integer> color = new ArrayList<Integer>(Collections.nCopies(10000, white));//cor
	
	    color.set(v, grey);
	    Queue<Integer> q = new LinkedList<Integer>();
	    q.offer(v);
	    while(!q.isEmpty()){
	        int u = q.peek(); 
	        q.poll();

	        for(int j=0;j<g.get(u).size();j++){ //percorre a lista de adjacências
	        	 int w = g.get(u).get(j);  //l o nó adjacente
		            if(color.get(w)==white){
		            	cont+=2;;  //se o nó ainda não foi visitado, inclue ele na lista
		            	color.set(w, grey); // marca o nó como em processamento
	                q.offer(w); //coloca o nó na fila
	            }
	        }
	        color.set(u, black);        
	    }
	}
	//FULLSTACKOVERKILL
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//FULLSTACKOVERKILL
		
		int qtd = Integer.parseInt(input.readLine());
		for(int i = 0; i<qtd ; i++){
			cont = 0;
			List<List<Integer>> g = new ArrayList<List<Integer>>();
			int n = Integer.parseInt(input.readLine());
			String[] casos = input.readLine().split(" ");
			int v = Integer.parseInt(casos[0]);
			int a = Integer.parseInt(casos[1]);
			for(int j = 0; j < 10000 ; j++){
				g.add(new ArrayList<Integer>());
			}
			for(int j = 0; j < a ; j++){
				String[] casos2 = input.readLine().split(" ");
				g.get(Integer.parseInt(casos2[0])).add(Integer.parseInt(casos2[1]));
				g.get(Integer.parseInt(casos2[1])).add(Integer.parseInt(casos2[0]));
			}
			//FULLSTACKOVERKILL
			dfs(g, n);
			System.out.println(cont);
		}	
		
	}

}
//FULLSTACKOVERKILL