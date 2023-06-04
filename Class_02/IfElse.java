import java.util.*;

public class IfElse {
    public static void main ( String[] args ) {

        // operator
        // <  >  <=  >=  == !=
        // > greater than operator

        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Please Enter your age : " );
        byte AgeVariable;
        AgeVariable = scanner.nextByte ();

        // if ( AgeVariable > 18 ) {
        //     System.out.println ( "You can visit this site :)" );
        //     // codes here
        // } else {
        //     System.out.println ( "Sorry! You can't visit this site." );
        //     // codes here
        // }
        if ( AgeVariable >= 18 ) {
            System.out.println ( "You can visit this site :)" );
            // codes here
        } else {
            System.out.println ( "Sorry! You can't visit this site." );
            // codes here
        }

    }
}
