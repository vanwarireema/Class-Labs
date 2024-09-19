import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
   This class is the main method of the circle bug method that allows the code
   to run in a spiral

   @author  Reema Vanwari
   @version 9/18/23

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Random Bugs - CircleBugRunner

   @author  Sources - None
 */
public class CircleBugRunner
{
    public static void main( String[] args )
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug(5);
        alice.setColor(Color.ORANGE);
        //RandomBug bob = new RandomBug();
        world.add(new Location(1, 9), alice);
        //world.add(new Location(5, 5), bob);
        world.show();
    }
}