
import java.util.*;

public class Array {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        // type [] arrayName = new type[10];  // preferable
        // type arrayName [] = new type[12];

        // type [] arrayName;
        // some codee....
        // arrayName = type[15];

        int [] numbers = new int[5];
        System.out.print ( "Please Enter 5 numbers : " );
        // for ( byte i = 0; i < 5; i++ ) {
        //     numbers[i] = scanner.nextInt();
        // }
        for ( byte i = 0; i < numbers.length; i++ ) {
            numbers[i] = scanner.nextInt();
        }

        int summation = 0;
        for ( byte i = 0; i < numbers.length; i++ ) {
            summation += numbers[i];
        }

        System.out.print ( "Given Values are : " );
        for ( byte i = 0; i < numbers.length; i++ ) {
            System.out.print ( numbers[i] + " " );
        }
        System.out.print ( "\n" );
        System.out.println ( "Summation is : " + summation );

        // int x = 5;
        // int y = ++x;
        // int z = x++;
        // System.out.println ( x + " " + y + " " + z );

    }
}
