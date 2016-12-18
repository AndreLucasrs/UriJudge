package grafos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class NoiteMuseum {
    public BufferedReader br;
    public PrintStream ps;

    int melhor;
    int tempos[][];
    int assistir[];
    boolean visitado[];
    boolean visto[][];
    int n;

    public void museu( int id, int onde, int count, int tempo ){
        int i, j;
        if( tempo <= 420 ){
            if( !visto[onde][id] ){
                visto[onde][id] = true;
                if( count>melhor ) {
                	melhor=count;
                }
                visitado[onde] = true;

                i = onde;
                for( j=0; j<n; j++ ) {
                	if( !visitado[j] ){
                		if( !visto[j][id|(1<<j)] ){
                			museu( id|(1<<j), j, count+1, tempo+tempos[i][j]+assistir[j] );
                		}
                	}
                }	
                visitado[onde] = false;
            }
        }
    }

    public void noite() throws Exception{
        
        br = new BufferedReader( new InputStreamReader( System.in ) );
        ps = System.out;
        int i, j, k;
        String identificador[];
        
        while(true){
            n = Integer.parseInt( br.readLine().trim() );
            if( n==0 ){
            	break;
            }

            assistir = new int[n];
            identificador = br.readLine().split( " " );
            for( i=0; i<n; i++ ){
                assistir[i] = Integer.parseInt( identificador[i] );
            }

            tempos = new int[n][n];
            for( i=0; i<n; i++ ){
                identificador = br.readLine().split( " " );
                for( j=0; j<n; j++ ){
                    tempos[i][j] = Integer.parseInt( identificador[j] );
                }
            }

            melhor = 0;
            visto = new boolean[n][1<<n];
            for( i=0; i<n; i++ ){
                Arrays.fill( visto[i], false );
            }

            visitado = new boolean[n];
            for( i=0; i<n; i++ ){
                Arrays.fill( visitado, false );
                museu( 1<<i, i, 1, assistir[i] );
            }
 
            ps.println( melhor );
        }
    }

    public static void main( String args[] ) throws Exception{
        (new NoiteMuseum()).noite();
    }
}
