
import java.util.*;

public class Switch {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Please Enter your age : " );
        byte AgeVariable = scanner.nextByte ();

        switch ( AgeVariable ) {
            case 1:
                System.out.println ( "Age is 1" );
                break;
            case 5:
                System.out.println ( "Age is 5" );
                break;
            default:
                System.out.println ( "Age is not 5 not 1" );
                break;
        };

        switch ( AgeVariable ) {
            case 1:
            case 5:
                System.out.println ( "Age is 1 or 5" );
                break;
            default:
                System.out.println ( "Age is not 5 not 1" );
                break;
        };
    }
}
