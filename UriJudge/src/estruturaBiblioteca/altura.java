package estruturaBiblioteca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class altura{   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nc, n;
        nc = Integer.parseInt(br.readLine());
        while(nc-- != 0)
        {
        	int[] altura, count, ordenado;
        	String[] a;
        	StringBuilder saida;
        	saida = new StringBuilder();
        	count = new int[231];
        	n = Integer.parseInt(br.readLine());
        	altura = new int[n];
        	ordenado = new int[n];
        	a = br.readLine().split(" ");
        	for(int i = 0; i < n; i++)
        	{
        		altura[i] = Integer.parseInt(a[i]);
        		count[altura[i]]++;
        	}
        	for(int i = 1; i < 231; i++)
        	{
        		count[i] += count[i - 1];
        	}
        	for(int i = 0; i < n; i++)
        	{
        		ordenado[--count[altura[i]]] = altura[i]; 
        	}
        	saida.append(ordenado[0]);
        	for(int i = 1; i < n; i++)
        	{
        		saida.append(" ");
        		saida.append(ordenado[i]);
        	}
        	bw.write(saida.toString());
        	bw.write("\n");
        	bw.flush();
        }
    }
}
