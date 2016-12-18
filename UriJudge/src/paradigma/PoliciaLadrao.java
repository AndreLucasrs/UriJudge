package paradigma;

import java.util.Scanner;

public class PoliciaLadrao {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int entrada = input.nextInt();
		for(int i=0;i<entrada;i++){
			int[][] casos = new int[5][5];
			int [][] boleana = new int[5][5];
			for(int y=0;y<5;y++){
				for (int l=0;l<5;l++) {
					casos[y][l] = input.nextInt();
				}
			}
			if(Backtrack(casos, boleana, 0, 0) == true){
				System.out.println("COPS");
			}
			else{
				System.out.println("ROBBERS");
			}
		}
	}
	static boolean Backtrack(int m[][],int b[][],int i,int j){
		boolean v;
		if(i > 4 || i < 0 || j>4 || j < 0){
			return false;
		}
		if(b[i][j] == 1){
			return false;
		}
		if(m[i][j]==1){
			return false;
		}
		if(i==4 && j==4){
			return true;
		}
		else{
			b[i][j]=1;
			v = Backtrack(m, b, i-1, j);
			if(v==true){
				return true;
			}
			v = Backtrack(m, b, i+1, j);
			if(v==true){
				return true;
			}
			v = Backtrack(m, b, i, j-1);
			if(v==true){
				return true;
			}
			v = Backtrack(m, b, i, j+1);
			if(v==true){
				return true;
			}
			return false;
		}
	}
}