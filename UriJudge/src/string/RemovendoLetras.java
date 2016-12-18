package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class RemovendoLetras {
	static HashSet<String> map;

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		while ((entrada = input.readLine()) != null) {
			map = new HashSet<String>();
			backtrack_Helper(entrada, "", 0);

			ArrayList<String> list = new ArrayList<>(map);
			
			Collections.sort(list);
			
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println();
		}
	}

	static void backtrack_Helper(String palavra, String str, int i) {
		
		if (i == palavra.length()) {
			return;
		} else {
			str += palavra.charAt(i);
			if(!map.contains(str)){
				map.add(str);
				backtrack_Helper(palavra, str, i + 1);
			}
			str = str.substring(0, str.length()-1);
			backtrack_Helper(palavra, str, i+1);
		}
	}
}
