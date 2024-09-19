import info.gridworld.actor.Bug;

/**
   Runs the bug in a circle instead of a box by removing a turn method from
   the box bug class

   @author  Reema Vanwari
   @version 9/18/23

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Random bugs - CircleBug

   @author  Sources - None
 */
public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public CircleBug( int length )
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if ( steps < sideLength && canMove() )
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}
