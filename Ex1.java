package day1.examples;

public class Ex1 {
	public static void main (String[] arg) {
		
		//Get the sum of all string numbers in array
		
		String[] strNum = { "1", "3", "7", "10" };
		
		int total = 0;
		
		for ( String tempStr : strNum ) {
			total += Integer.parseInt(tempStr);
			
		}
		System.out.println(total);
	}

}
