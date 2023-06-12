
public class Swapping {
	
	public static void swap ( Integer a, Integer b ) {
		Integer c = a;
		a = b;
		b = c;
	}

	public static void main(String[] args) {

		Integer a = 10;
		Integer b = 5;
		Integer c = a;
		a = b;
		b = c;
		swap ( a, b );

		System.out.println ( a + " " + b );

	}

}
