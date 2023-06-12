
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	// [access modifier] [return type] [name] ( [input], [input], ..... ) {
	// }
	public static double getMaximumTemperature ( double [] Temps, int Size ) {
		double Max_Temperature = Temps[0];
		for ( int i = 0; i < Size; i++ ) {
			double next_temp = Temps[i];
			if ( next_temp > Max_Temperature ) {
				Max_Temperature = next_temp;
			}
		}
		return Max_Temperature;
	}
	
	public static double getMinimumTemperature ( double [] Temps, int Size ) {
		double Min_Temperature = Temps[0];
		for ( int i = 0; i < Size; i++ ) {
			double next_temp = Temps[i];
			if ( next_temp < Min_Temperature ) {
				Min_Temperature = next_temp;
			}
		}
		return Min_Temperature;
	}
	
	public static double getAverageTemp ( double [] Temps, int Size ) {
		double Summation = 0.0;
		for ( int i = 0; i < Size; i++ ) {
			Summation = Summation + Temps[i];
		}
		double avg = Summation / (double)Size;
		return avg;
	}
	/*
	 * 2 | 7 | 3
	 *     6
	 *   -----
	 *     1
	 */
	
	public static double getMedian ( double [] Temps, int Size ) {
		Arrays.sort( Temps );
		if ( Size % 2 == 0 ) {
			// apply the even median rule
			// 4 6 9 19 -> 4/2 -> 2-1 -> 1
			int median_element = Size / 2;
			int median_index = median_element - 1;
			double median = (Temps[median_index] + Temps[median_index + 1]) / 2.0;
			return median;
		} else {
			// apply the odd median rule
			// 5 8 9 11 13 -> 5 -> (5+1)/2 = 3 - 1 = 2 index
			int median_element = ( Size + 1 ) / 2;
			double median = Temps[ median_element - 1 ];
			return median;
		}
	}
	
	public static double getRange ( double [] Temps, int Size ) {
		double maximum = getMaximumTemperature ( Temps, Size );
		double minimum = getMinimumTemperature ( Temps, Size );
		return maximum - minimum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		// How may temperatues are there : 5
		// array -> size of ( 5 )
		// Enter 5 temperatures
		// 12.0 13.6 2.5 7.6 0.12
		
		System.out.print( "How many tempratures are there : " );
		int ArraySize = sc.nextInt ();
		
		double [] Temperatures = new double [ ArraySize ];
		System.out.print( "Enter " + ArraySize + " Temperatures : " );
		
		for ( int i = 0; i < ArraySize; i++ ) {
			Temperatures[i] = sc.nextDouble ();
		}
		
		double Max_Temp = getMaximumTemperature ( Temperatures, ArraySize );
		double Min_Temp = getMinimumTemperature ( Temperatures, ArraySize );
		double Average = getAverageTemp ( Temperatures, ArraySize );
		double Median = getMedian ( Temperatures, ArraySize );
		double Range = getRange ( Temperatures, ArraySize );
		
		System.out.println( "Maximum Temperature is : " + Max_Temp );
		System.out.println( "Minimum Temperature is : " + Min_Temp );
		System.out.println( "Average is : " + Average );
		System.out.println( "Median is : " + Median );
		System.out.println( "Range is : " + Range );
		
		/*
		double Max_Temperature = Temperatures[0];
		for ( int i = 0; i < ArraySize; i++ ) {
			double Temp = Temperatures[i];
			if ( Temp > Max_Temperature ) {
				Max_Temperature = Temp;
			}
		}
		
		Arrays.sort ( Temperatures );
		
		for ( int i = 0; i < ArraySize; i++ ) {
			System.out.print( Temperatures[i] + " " );
		}
		*/
		

	}
	/*
	 * 0.3 + 5.6 + 8.7 + 0.9
	 * ----------------------  = avg / mean
	 *          4
	 * 
	 * 0.3 5.6 8.7 0.9 
	 * max_num = Array[0] = 0.3
	 * max_num = 5.6
	 * max_num = 8.7
	 * max_num = 8.7
	 * 
	 * 0 3 2 1 4 7
	 * 
	 * 3 4 6 7 9 10
	 * this rule is for even sized array
	 * 6 -> 6/2 = 3 -> 3-1 = 2 ===   (Array[2] + Array[2 + 1] ) / 2
	 * == (6 + 7) / 2 = 6.5 median
	 * 
	 * this rule is for odd sized array
	 * 1 3 4 6 7 9 10
	 * 7  -> 7 / 2  === 3
	 * 7 -> (double)7 / (double)2 = ceil(3.5) = 4.0 -> 4
	 * 7 -> (7 + 1) / 2 == 4
	 * 
	 * Number1 / Numbder2
	 * ( Number1 + ( Number2 - 1 ) ) / Number2
	 * ( 7 + ( 2 - 1 ) ) / 2
	 * ( 7 + 1 ) / 2
	 * 
	 * ( 9 + 1 ) / 2
	 * 
	 *  2 -4 1 -3
	 *  -4 -3 1 2
	 *  range 4 - 1 = 3
	 *  range max - min = 2 - ( -4 ) = 6
	 */

}
