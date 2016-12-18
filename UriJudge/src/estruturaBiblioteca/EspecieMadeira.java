package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EspecieMadeira {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int casos = Integer.parseInt(input.readLine());
		String linha = input.readLine();
		for(int i=0; i < casos;i++){
			String e;
			int count =0;
			
			Map<String, Integer> especie = new TreeMap<String,Integer>();
			while(((e = input.readLine())!=null) && e.length() > 0){
				if(especie.containsKey(e)){
					especie.put(e, especie.get(e).intValue()+1);
				}
				else{
					especie.put(e, 1);
				}
				count++;
			}
			Set set = especie.entrySet();
		      Iterator iterator = set.iterator();
		      while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print(mentry.getKey()+" ");
		         double valor = Double.parseDouble(mentry.getValue()+"");
		         System.out.printf("%.4f\n",(valor/count)*100);
		      }
		      
			if(i != casos-1){
				System.out.println();
			}
		}

	}

}
