import info.gridworld.actor.Bug;

/**
   a method is created that runs the random bug in a spiral rather than a circle
   or a box

   @author  Reema Vanwari
   @version 9/18/23

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Exercise 2 - SpiralBug

   @author  Sources - None
 */
public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;

    public SpiralBug( int length )
    {
        steps = 0;
        sideLength = length;
    }

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
            turn();
            steps = 0;
            sideLength++;
        }
    }
}
