package day1.examples;

public class Array {
	public static void main (String[] arg) {
		
		int[] x = { 1,2,3,4,5,6,7 };
		
		for ( int tempNum : x ) {
			System.out.println("Values in array x " + tempNum);
		}
		//-------------------------------------------------------
		String[] y = { "one", "two", "three" };
		
		for ( String tempStr : y ) {
			System.out.println("Values in array y " + tempStr);
		}
		//-------------------------------------------------------
		//With array of NUMBERS, java alway's put the unassigned values to (0)
		int[] a = new int[5];
			
		a[1] = 1;
		a[3] = 4;
		
		for ( int tempA : a ) {
			System.out.println("a " + tempA);
		}
		//-------------------------------------------------------
		//with array of strings, by default it puts (null) for unassigned values
		String[] s = new String[5];
		
		s[2] = "Two";
		s[3] = "Five";
		
		for ( String tempS : s ) {
			System.out.println("s " + tempS);
		}
	}

}


