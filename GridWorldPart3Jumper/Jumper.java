import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

/**
 * A <code>Jumper</code> is an actor that will jump over Rocks and Flowers and
 * turn. A jumper can remove another jumper by jumping on them.
 * 
 * @author Reema Vanwari, Chang He
 * @version 10/26/23
 * @author Period: 1
 * @author Assignment: GridWorld_Part3_Jumper
 * @author Sources: None
 */
public class Jumper
    extends Bug
    implements Edible

// if can move == false,
//
{
    /**
     * moves the jumper two steps forword
     */
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
        {
            return;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next2 = next.getAdjacentLocation(getDirection());
        if (gr.isValid(next2))
        {
            moveTo(next2);
        }
        

        else
        {
            removeSelfFromGrid();
        }
    }


    /**
     * bool - determines if jumper can move or not
     * 
     * @return t/f for movement
     */
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
        {
            return false;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next2 = next.getAdjacentLocation(getDirection()); // replace
                                                                   // adjacent
                                                                   // with loc +
                                                                   // 2
        if (!gr.isValid(next2))
        {
            return false;
        }
        Actor neighbor = gr.get(next2);
        return (neighbor == null) || (neighbor instanceof Edible);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor

        // if reaches end of grid - return false
        // if location + 2 on grid = non edible false
        //
    }

}
