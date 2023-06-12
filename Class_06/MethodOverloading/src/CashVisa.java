
import java.util.Scanner;

public class CashVisa {
	public static double getPercentAmount ( double spent, double percent ) {
		/*
		100 ...    percent
		1         (percent / 100)
		spent     (percent / 100) * spent
		*/
		double getAmount = ( percent / 100.0 ) * spent;
		return getAmount;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.println ( "This program will determine the cash back amount of any purchases made using your visa.");
		System.out.println ( "" );
		System.out.print( "Enter the amount of your purchase: $" );
		
		double UserPerchase = sc.nextDouble();
		double creditPercent = 0.0;
		
		if ( UserPerchase < 200.0 ) {
			creditPercent = 1.5;
		} else if ( UserPerchase >= 200.0 && UserPerchase < 1000.0 ) {
			creditPercent = 1.75;
		} else if ( UserPerchase >= 1000.0 ) {
			creditPercent = 2.25;
		}
		// 
		double UserCredit = getPercentAmount ( UserPerchase, creditPercent );
		
		System.out.println( "Your total cash amount earned is $" + UserCredit );
		
		System.out.println( "Would you like to apply the money to your purchase or save it for a future credit?");
		
		System.out.println( "(y) for purchase (n) for future credit: ");
		String UserAns = sc.next();
		
		if ( UserAns.equals( "y" ) ) {
			System.out.print ( "You have decided to apply your cash credit to your current purchase of $");
			System.out.printf ( "%.2f", UserPerchase );
			System.out.print( ".\nYour final bill after applying your cash credit amount of $" );
			System.out.printf ( "%.2f", UserCredit);
			System.out.print(" is now $");
			System.out.printf ( "%.2f", UserPerchase - UserCredit );
			System.out.print(".\nThank you for your purchase.");
		} else {
			System.out.print( "You have opted to save your cash credit for future purchases.\n"
					+ "Your current purchase amount is $");
			System.out.printf ( "%.2f", UserPerchase );
			System.out.println ("");
			System.out.printf( "You have a credit of $%.2f that you may use for future purchases.", UserCredit );
		}
		
		// System.out.print( getPercentAmount ( 1345.56, 2.25 ) );

	}

}
