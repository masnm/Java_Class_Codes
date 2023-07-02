
public class Varidic {
	
	static int add2 ( int[] inp ) {
		int sum = 0;
		for ( int i = 0; i < inp.length; i++ ) {
			sum += inp[i];
		}
		return sum;
	}
	
	static int add ( int ... inp ) {
		int sum = 0;
		for ( int i = 0; i < inp.length; i++ ) {
			sum += inp[i];
		}
		return sum;
	}
	
	static int maxInt ( int ... inp ) { // 2, 7, 4, 0
		int mx = inp[0];
		for ( int i = 0; i < inp.length; i++ ) {
			int value = inp[i];
			if ( value > mx )
				mx = value;
		}
		return mx;
	}
	
	public static void main(String[] args) {
		
		int first = 2, second = 3, third = 4;
		
		int ans = add ( first );
		int ans2 = add ( first, second );
		int ans3 = add ( first, second, third );
		
		int[] arr = { 3, 2, 1, 4 };
		ans = add ( arr );
		
		System.out.printf ( "Ans %d Ans2 %d Ans3 %d\n", ans, ans2, ans3 );
		
		System.out.println ( "Ans : " + ans +
				"\nAns2 : " + ans2 +
				"\nAns3 : " + ans3 );

	}

}
