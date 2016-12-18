package estruturaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solicitacao{
	String nome;
	String cor;
	String tamanho;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}

class Comparador implements Comparator<Solicitacao>{
    public int compare(Solicitacao s1, Solicitacao s2){
   
        if(s1.getCor().compareTo(s2.getCor()) < 0){
            return -1;
        }
        if(s1.getCor().compareTo(s2.getCor()) > 0){
            return 1;
        }
        if(s1.getTamanho().compareTo(s2.getTamanho()) > 0){
            return -1;
        }
        if(s1.getTamanho().compareTo(s2.getTamanho()) < 0){
            return 1;
        }
        return (s1.getNome().compareTo(s2.getNome()));
    }
}

public class Camisetas {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int count = 0;	
		while(true){
			int entrada = Integer.parseInt(br.readLine());
			if(entrada ==0){
				break;
			}
			if(count > 0){
				System.out.println();
			}
			count++;
			List<Solicitacao> lista = new ArrayList<>();
			for(int i = 0; i < entrada;i++){
				Solicitacao s = new Solicitacao();
				String nome = br.readLine();
				String[] tamCor = br.readLine().split(" ");
				String cor = tamCor[0];
				String tamanho = tamCor[1];
				s.nome = nome;
				s.cor = cor;
				s.tamanho = tamanho;
				lista.add(s);
				lista.add(s);
				lista.add(s);
			}
			Collections.sort(lista,new Comparador());
			for(int j = 0; j < lista.size();j+= lista.size()/entrada){
				System.out.print(lista.get(j).getCor()+" ");
				System.out.print(lista.get(j).getTamanho()+" ");
				System.out.println(lista.get(j).getNome());
				
			}
			
		}
		
	}
}
