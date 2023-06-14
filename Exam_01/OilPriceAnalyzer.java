
import java.util.Arrays;
import java.util.Scanner;

/* ClassName : oilPriceAnalyzer
 * This class has the main method as the starting or entry poing java class should
 * have this class has five methods
 *
 * static double getAveragePrice ( double[], int )
 * static double getMaximumPrice ( double[], int )
 * static double getMinimumPrice ( double[], int )
 * static double getMedianPrice ( double[], int )
 * static void main ( String[] args )
 *
 * all the methods done as their name says. See more above the method defination
 */
public class OilPriceAnalyzer {

    /*
     * Name: getAveragePrice
     * Takes: Array of Double & an int
     * return the average of the array. using the formula
     *
     *            Array[0] + Array[1] + ... + Array[n]
     * Average = -------------------------------------
     *                            n
     */
    public static double getAveragePrice ( double [] oilPrices, int ArraySize ) {
        double Summation = 0.0;
        for ( int i = 0; i < ArraySize; i++ ) {
            Summation += oilPrices[i];
        }
        return Summation / (double)ArraySize;
    }

    /*
     * Name: getMaximumPrice
     * Takes: Array of double & an int
     * Returns: Maximum of the array
     *
     * uses a linear approach to find out the maximum number
     * first assumes that the first element is the maximum and then iterate over the array
     * for each element of the array compares the element with the current maximum
     * and if current element is greater than current maximum then update the maximum
     * with current element
     */
    public static double getMaximumPrice ( double [] oilPrices, int ArraySize ) {
        double Maximum = oilPrices[0];
        for ( int i = 0; i < ArraySize; i++ ) {
            double temp = oilPrices[i];
            if ( temp > Maximum ) {
                Maximum = temp;
            }
        }
        return Maximum;
    }

    /*
     * Name: getMinimumPrice
     * Takes: Array of double & an int
     * Returns: Minimum of the array
     *
     * uses a linear approach to find out the minimum number
     * first assumes that the first element is the minimum and then iterate over the array
     * for each element of the array compares the element with the current minimum
     * and if current element is greater than current minimum the update the maximum
     * with current element
     */
    public static double getMinimumPrice ( double [] oilPrices, int ArraySize ) {
        double Minimum = oilPrices[0];
        for ( int i = 0; i < ArraySize; i++ ) {
            double temp = oilPrices[i];
            if ( temp < Minimum ) {
                Minimum = temp;
            }
        }
        return Minimum;
    }

    /*
     * Name: getMedianPrice
     * Takes: Array of double and an int
     * Returns: median value of the array
     *
     * for an even sized array this method uses the below formula
     *
     * here we get 2 number as the median because this array is even sized
     * median_element is = ArraySize / 2
     * median_index = median_element - 1
     * firstMedian = Array[median_index]
     * secondMedian = Array[median_index + 1]
     * median = ( firstMedian + secondMedian ) / 2.0
     *
     * for an odd sized array this method uses the below formula
     *
     * median_element is = (int) Ceil ( (ArraySize) / 2.0 ) = (ArraySize + 1) / 2
     * median_index = median_element - 1
     * median = Array[median_index]
     *
     */
    public static double getMedianPrice ( double [] oilPrices, int ArraySize ) {
        Arrays.sort ( oilPrices );
        if ( ArraySize % 2 == 0 ) {
            // for the even sized array
            int medianElement = ArraySize / 2;
            int medianIndex = medianElement - 1;
            double median = (oilPrices[medianIndex] + oilPrices[medianIndex + 1]) / 2.0;
            return median;
        } else {
            // for the odd sized array
            int medianElement = (ArraySize + 1) / 2;
            int medianIndex = medianElement - 1;
            double median = oilPrices[medianIndex];
            return median;
        }
    }

    /* Name: main
     * Takes: array of String
     * returns: Nothing i.e. void
     *
     * Entry point of the hole program
     */
    public static void main ( String [] args ) {

        Scanner scanner = new Scanner ( System.in );

        // printing some basic information about this program.
        System.out.println ( "\tBidushi’s Oil Price Analyzer Program" );
        System.out.println ( "\t************************************" );
        System.out.println ( "" );
        System.out.println ( "This program will calculate and display some statistics about oil prices." );
        System.out.println ( "" );

        // asking the user for array size
        System.out.print ( "Enter how many prices will be entered: " );

        int ArraySize = scanner.nextInt ();
        double [] oilPrices = new double[ArraySize];

        // asking the user for evey element of the array
        for ( int i = 0; i < ArraySize; i++ ) {
            String message = String.format ( "Enter price %d and press ENTER: $", i + 1 );
            System.out.print ( message );
            oilPrices[i] = scanner.nextDouble ();
        }
        System.out.println ( "" );

        // printing the statistics of the inputs
        String Message;
        System.out.println ( "Here are the statistics for the prices entered:" );

        // calculating the Average Price using method getAveragePrice and printing the average
        double AveragePrice = getAveragePrice ( oilPrices, ArraySize );
        Message = String.format ( "The average price was $%.2f per barrel", AveragePrice );
        System.out.println ( Message );

        // calculating the MaximumPrice using method getMaximumPrice and printing the maximum
        double MaxPrice = getMaximumPrice ( oilPrices, ArraySize );
        Message = String.format ( "The highest daily price was $%.2f per barrel", MaxPrice );
        System.out.println ( Message );

        // calculating the MinimumPrice using method getMinimumPrice and printing the minimum
        double MinPrice = getMinimumPrice ( oilPrices, ArraySize );
        Message = String.format ( "The lowest daily price was $%.2f per barrel", MinPrice );
        System.out.println ( Message );

        // calculating the median using method getMedianPrice and printing the median
        double MedianPrice = getMedianPrice ( oilPrices, ArraySize );
        Message = String.format ( "The median price of all the daily prices was $%.2f", MedianPrice );
        System.out.println ( Message );
    }
}
