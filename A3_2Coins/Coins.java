import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Coins: This class accepts a certain amount of monetary change (in cents).
 * The output is a list of the number of quarters, dimes, nickels, and
 * pennies that will make that amount of change with the least number of
 * coins possible.
 *
 * @author Reema Vanwari
 * @version 9/5/23
 * @author Period: 1
 * 
 * @author Assignment: Lab Activity 3.2 - Coins
 * 
 * @author Sources: None
 */
public class Coins
{
    private int myChange;

    public Coins( int change )
    {
        myChange = change;
    }

    public void calculate()
    {
        int quarter = 25, nickel = 5, penny = 1, dime = 10;
        
        quarter = myChange / quarter; //finds # of quarters
        myChange -=(quarter * 25); //subtracts number of cents (in quarters) from total amount of change
        dime = myChange / dime;
        myChange -=(dime* 10);
        nickel = myChange / nickel;
        myChange -=(nickel * 5); //subtrats # of cents in nickels
        penny = myChange / penny;
        myChange -= (penny);
        System.out.print("Quarter(s) " + "\t" + quarter+ "\n");
        System.out.print("Dime(s) "+ "\t" + dime+ "\n");
        System.out.print("Nickel(s) " + "\t"+ nickel+ "\n");
        System.out.print("Penny(s) " + "\t"+ penny+ "\n");

    }
    
    /**
     * Intended only for debugging.
     * 
     * <p>A generic toString implementation that uses reflection to print
     * names and values of all fields <em>declared in this class</em>.
     * Note that superclass fields are left out of this implementation.</p>
     * 
     * @return a string representation of this Easter.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getType().getName() + " "
                    + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }
            separator = ", ";
        }
        return str + "]";
    }

    /**
     * Tester for the Coins class.
     * @param args command line arguments - not used
     */
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );

        System.out.print( "Please enter the number of cents --> " );
        int cents = console.nextInt();

        Coins change = new Coins( cents );
        change.calculate();
    }
}
