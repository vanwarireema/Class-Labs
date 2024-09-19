import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 *  runs the jumper
 *
 *  @author  Chang He, Reema Vanwari
 *  @version 10/26/23
 *  @author  Period: 1
 *  @author  Assignment: GridWorld_Part3_Jumper
 *
 *  @author  Sources: None
 */
public class JumperRunner
{
    public static void main( String[] args )
    {
        ActorWorld world = new ActorWorld();
        Jumper chang = new Jumper();
        world.add( new Location( 2, 0 ), chang );
        chang.setColor( Color.GREEN );
        Jumper reema = new Jumper();
        reema.setColor( Color.BLUE );
        world.add( new Location( 0, 0 ), reema );
        Flower flower = new Flower();
        world.add( new Location( 9, 0 ), flower );
        world.show();
    }
}