package day1.examples;

public class AndOr {
	public static void main (String[] arg) {
		
		int x, y;
		x = 10;
		y = -10;
		
		if ( x > 0 && y > 0 ) {
			System.out.println("Both numbers are positive");
		} else if ( x < 0 || y < 0 ) {
			System.out.println("Atleast one number is negative");
		} else {
			System.out.println("Both numbers are negative");
		}
	}
}
