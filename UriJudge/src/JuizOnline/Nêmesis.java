package JuizOnline;

//FULLSTACKOVERKILL
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Nêmesis {

static int n, m;
static int d[][]=new int[505][505];
static int dx[] = { 0, 0, 1, -1 };
static int dy[] = { 1, -1, 0, 0 };
static char l[][]=new char[505][505];
	public static class point {
		int x;
		int y;

		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}
	public static Comparator<point> Compare = new Comparator<point>() {

		public int compare(point c1, point c2) {
			Integer aa = c1.x;
			return aa.compareTo(c2.x);
		}

	};

	// FULLSTACKOVERKILL
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String[] aux = (entrada.readLine()).split(" ");
		int m = Integer.parseInt(aux[0]);
		int n = Integer.parseInt(aux[1]);
		point H = null, E = null;
		for( int i = 0; i < m; i++ ){
			String s = entrada.readLine();
	        for( int j = 0; j < n; j++ ) {
	        	
	        	 l[i][j]=s.charAt(j);
	   //     System.out.print( l[i][j]);
	            if( l[i][j] == 'H' )
	                H =new  point( i, j );
	            if( l[i][j] == 'E' )
	                E = new point( i, j );
	        }//System.out.println();
		}
	    dijkstra( H );
	    if( d[E.x][E.y] == Integer.MAX_VALUE )
	        System.out.println( "ARTSKJID" );
	    else
	        System.out.println( d[E.x][E.y] );  
	    for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				System.out.print(d[i][j]);
			}
			System.out.println();
		}

	}

	private static void dijkstra(point u) {

		for( int i = 0; i < n; i++ )
	        for( int j = 0; j < m ; j++ )
	            d[i][j] = Integer.MAX_VALUE;
	            
	    Queue<point> q=new PriorityQueue<point>(Compare);
	    q.offer( u );
	    d[u.x][u.y] = 0;
	    
	    while( !q.isEmpty() ) {
	        u = q.element();
	        q.poll();
	        
	        for( int i = 0; i < 4; i++ ) {
	            point v =new point( u.x + dx[i], u.y + dy[i] );
	            int vd = 0;
	            
	            if( 0 <= v.x && v.x < n && 0 <= v.y && v.y < m && l[v.x][v.y] != '#' ) {
	                if( l[v.x][v.y] != 'H' && l[v.x][v.y] != 'E' && l[v.x][v.y] != '.' )
	               		vd = l[v.x][v.y] - '0';
	                    
	                if( d[v.x][v.y] > d[u.x][u.y] + vd ) {
	                    d[v.x][v.y] = d[u.x][u.y] + vd;
	                    q.offer( v );
	                }
	            }
	        }
	    }
	}

	
}
//FULLSTACKOVERKILL
