package day1.examples;

public class TowDimArray {
	public static void main (String[] arg) {
		int tempNum = 10;
		int [][] twoDim = new int[4][3];
		
		for ( int i = 0; i < 4; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				//Set row[0] col[0] = 10; and the loop continue...
				twoDim [i][j] = tempNum;
				tempNum ++;
				System.out.print(twoDim[i][j] + " ");
			}
			System.out.println();
		}
	}

}
