import java.util.Scanner;

// Name of Program File: IGlass.java
// Author: Bidushi Kabir
// Date: Sat Jun  3 10:04:34 PM +06 2023

// Description :
// This program used to take order from various company of the product
// IGlass. This program takes input form command line and make calculations
// about the order and price. It also checks for any problems with the
// order i.e. can't ship item or change of price based on any issues on
// the supply.


public class IGlass {
    public static void main ( String[] args ) {
        System.out.println ( "\t\tIGlass Shipping Details" );
        System.out.println ( "\t\t-----------------------" );
        System.out.println ( "" );
        System.out.println ( "First some information is needed..." );
        System.out.println ( "" );

        String CompanyName, Message;
        double PricePerGlass;
        long NumberOfGlassOrder, SafetyBoxCapacity, AvailableBoxes, TotalBoxesRequired;

        Scanner scanner = new Scanner( System.in );

        System.out.print ( "Enter the Company that is placing the order: " );
        CompanyName = scanner.nextLine();
        System.out.print ( "Please state the price per IGlass that was quoted for this order $" );
        PricePerGlass = scanner.nextDouble();
        System.out.print ( "Enter the number of IGlasses that " + CompanyName + " would like to order: " );
        NumberOfGlassOrder = scanner.nextLong();
        System.out.print ( "Enter the maximum number of IGlasses that can be shipped in each safety box: " );
        SafetyBoxCapacity = scanner.nextLong ();
        System.out.print ( "Enter the number of safety boxes that are available for this order: " );
        AvailableBoxes = scanner.nextLong ();
        System.out.println ( "" );


        System.out.println ( "Thank you for your order.  The order is being processed and shipping details will follow:" );
        Message = String.format ( "Please be advised that your order totals $%.2f.", PricePerGlass * (double)NumberOfGlassOrder );
        System.out.println ( Message );

        System.out.println ( "" );
        System.out.print ( "Here are the results...");
        System.out.println ( "" );

        TotalBoxesRequired = (long) ( Math.ceil ( NumberOfGlassOrder / (double)SafetyBoxCapacity ) );
        Message = String.format ( "A minimum of %d safety boxes are required to ship the entire order.", (int) TotalBoxesRequired );
        System.out.println ( Message );

        if ( AvailableBoxes < TotalBoxesRequired ) {
            Message = String.format ( "Unfortunately we only have %d safety boxes available for shipping.", (int) AvailableBoxes );
            System.out.println ( Message );
        }

        long TotalItemShipped = AvailableBoxes * SafetyBoxCapacity;
        double ShippedPercentage, NotShippedPrice = 0.00;

        if ( TotalItemShipped >= NumberOfGlassOrder ) {
            ShippedPercentage = 100.00;
        } else {
            ShippedPercentage = (double) 100.0 * ( (double)TotalItemShipped / (double)NumberOfGlassOrder );
        }

        Message = String.format ( "%d IGlasses (%.2f%%) are being shipped.", (int)TotalItemShipped, ShippedPercentage );
        System.out.println ( Message );

        if ( AvailableBoxes < TotalBoxesRequired ) {
            Message = String.format ( "%d IGlasses (%.2f%%) cannot be shipped.", (int)(NumberOfGlassOrder - TotalItemShipped ), (double)100.00 - ShippedPercentage );
            System.out.println ( Message );
            NotShippedPrice = (double) (NumberOfGlassOrder - TotalItemShipped ) * (double) PricePerGlass;
            Message = String.format ( "Since we have not been able to ship the entire order, you will be getting a credit of $%.2f.", NotShippedPrice );
            System.out.println ( Message );
            Message = String.format ( "Your invoice now totals $%.2f", (PricePerGlass * (double)NumberOfGlassOrder) - NotShippedPrice );
            System.out.println ( Message );
        } else {
            Message = String.format ( "There would be room for an extra %d pair(s) of IGlasses.", (int)(TotalItemShipped-NumberOfGlassOrder) );
            System.out.println ( Message );
        }
    }
}