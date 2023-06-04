
import java.util.*;

public class For {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        // 12 = { 1, 2, 3, 4, 6, 12 }
        // for ( [initializition] ; condition ; update ) {
        // }
        // A += B ->  A = A + B
        // ++  --   // incriment  // decriment

        // loop upto exact value
        //  byte ByteVariable, one = 1;
        //  for ( ByteVariable = 1; ByteVariable <= 10; ByteVariable++ ) {
        //      System.out.print ( ByteVariable + " " );
        //  }

        System.out.print ( "Please Enter a number : " );
        byte Limit = scanner.nextByte ();

        // finding all the divisors of a number i.e. Limit
        // for ( byte LoopVariable = 1; LoopVariable <= Limit; LoopVariable++ ) {
        //     // limit = 14
        //     // LoopVariable = 7
        //     // 14 % 7 == 0 
        //     if ( Limit % LoopVariable == 0 ) {
        //         System.out.print ( LoopVariable + " " );
        //     }
        // }

        // + - * / ++ -- %
        // 13 / 2 = 6
        // 13 % 2 = 1
        // 11 / 3 = 3
        // 11 % 3 = 2
        // 9 % 3 = 0


        // 5
        // 1 + 2 + 3 + 4 + 5 = 15
        byte Summation = 0;
        for ( byte i = 1; i <= Limit; i++ ) {
            Summation += i;
        }
        System.out.print ( "Summation is : " + Summation );

        // summation from 1 .. n is   (n * (n + 1)) / 2

        // Scope resolution
        // { }
    }
}
