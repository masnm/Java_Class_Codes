
import java.util.*;

public class Palindrome {
	
	public static boolean isPalindrome ( String words ) {
		String second = new StringBuilder(words).reverse().toString();
		return second.equals( words );
		// O(n) : space complexity
		// N + N + N == O(3N) == O(N) : time complexity
	}
	
	public static boolean isPalindrome3 ( String words ) {
		int n = words.length();
		for ( int i = 0; i < n / 2; i++ ) {
			if ( words.charAt( i ) != words.charAt( n - i - 1 ) ) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome2 ( String words ) {
		int n = words.length();
		for ( int i = 0; i < n; i++ ) {
			if ( words.charAt( i ) != words.charAt( n - i - 1 ) ) {
				return false;
			}
		}
		return true;
		/*
		[r] [a] [c] [e] [c] [a] [r]    
		 0   1   2   3   4   5   6   7
		 7 / 2 = 3
		 
		 [a] [b] [b] [a]
		 0   1   2   3    4
		 4/2 = 2
		
		    []   []   [] []  [] [] []
		n   n-1  n-2  n-3. .  2  1  0
		n - i - 1
		i = 1, n - 1 - 1 => n - 2
		*/
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter a String : " );
		String words = sc.nextLine();
		
		boolean palindroome = isPalindrome2 ( words );
		
//		// <condition> ? <opt1> : <opt2>
//		if ( palindroome == true ) {
//			System.out.println ( "Palindrome" );
//		} else {
//			System.out.println ( "Not a palindrome" );
//		}
		System.out.println ( palindroome ? "Palindrome" : "Not a Palindrome" );
		
		/*
		int a = 4, b = 6;
		int mx;
		if ( a > b ) mx = a;
		else mx = b;
		mx = (a > b ? a : b);
		*/
	}

}
