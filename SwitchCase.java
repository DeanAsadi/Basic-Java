package day1.examples;

public class SwitchCase {
	public static void main (String[] arg) {
		
		String x = "One";
		
		switch( x ) {
		case("Zero"):
			System.out.println("Value is Zero");
			break;
		case("One"):
			System.out.println("Value is One");
			break;
		default:
			System.out.println("No value!!");
			break;
		} 
	}

}
