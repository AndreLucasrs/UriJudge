package JuizOnline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrimeiroDicionarioAndy {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String e;
		Map<String, Integer> especie = new TreeMap<String,Integer>();
		while(((e = input.readLine())!=null) && e.length() > 0){
			if(especie.containsKey(e)){
				especie.put(e, especie.get(e).intValue()+1);
			}
			else{
				especie.put(e, 1);
			}
		}
		Set set = especie.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	    	Map.Entry mentry = (Map.Entry)iterator.next();
	        System.out.println(mentry.getKey());
	      }
	      

	}

}
