
import java.util.*;

public class IfElseTwo {
    public static void main ( String[] args ) {

        // unary operator
        // ! -
        // !true == false   // !false == true

        // operator
        // <  >  <=  >=  == !=
        // > greater than operator

        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Please Enter your age : " );
        byte AgeVariable = scanner.nextByte ();

        System.out.print ( "Please Enter your nationality : " );
        scanner.nextLine ();
        String NationalityVariable = scanner.nextLine();

        // Nationality Bangladeshi and age >= 16  // yes visit
        // Nationality not Bangladeshi and age >= 18  // yes visit
        // no not visit

        // if ( NationalityVariable.equals ( "Bangladeshi" ) && AgeVariable >= 16 ) {
        //     System.out.println ( "You can visit the site :)" );
        // } else if ( !NationalityVariable.equals ( "Bangladeshi" ) && AgeVariable >= 18 ) {
        //     System.out.println ( "You can visit the site :)" );
        // } else {
        //     System.out.println ( "Sorry! you can't visit the site." );
        // }

        if ( (NationalityVariable.equals ( "Bangladeshi" ) && AgeVariable >= 16)
                || (!NationalityVariable.equals ( "Bangladeshi" ) && AgeVariable >= 18) ) {
            System.out.println ( "You can visit the site :)" );
        } else {
            System.out.println ( "Sorry! you can't visit the site." );
        }

        /*
         * Natinality != Bangladeshi
         * ! ( Natinality == Bangladeshi )
         *
         *  Bangladeshi != Bangladeshi  ->  fasle
         *  Indian != Bangladeshi       ->  True
         *
         *  ! ( Bangladeshi == Bangladeshi )  -> ! ( True )  -> False
         *  ! ( Indian == Bangladeshi ) -> ! ( false )  -> True
         *
         */
    }
}
