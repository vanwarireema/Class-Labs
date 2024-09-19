import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

/**
 * the bluster critter class finds its neighbors and eats the neighbors that
 * aren't rocks
 * the get actors methods finds the location of each actor
 * the processing method eats them
 *
 * @author Reema Vanwari
 * @version 11/28/23
 * @author Period: 1
 * @author Assignment: BlusterCritter - GridWorld Part4 Exercise 4
 *
 * @author Sources: None
 */
public class BlusterCritter extends Critter {
    private int courage;

    /**
     * 
     * @param c integer value of the courage
     */
    public BlusterCritter(int c) {
        courage = c;
    }

    /**
     * finds the location of all the neighboring actors
     * <br />
     * Postcondition: The state of all actors is unchanged.
     * 
     * @return a list of actors that this
     *         critter wishes to process.
     * 
     *         gets neighbors,
     */
    public ArrayList<Actor> getActors() {
        Grid<Actor> gr = getGrid();
        ArrayList<Actor> actors = new ArrayList<Actor>();

        Location location = getLocation();
        int row = location.getRow();
        int col = location.getCol();

        for (int i = row - 2; i <= row + 2; i++) {
            for (int x = col - 2; x <= col + 2; x++) {
                Location temp = new Location(i, x);
                if (getGrid().isValid(temp)) {
                    Actor actr = gr.get(temp);
                    if (actr instanceof Critter && (i != row || x != col))

                    {
                        actors.add(actr); // adds to the array
                    }

                }

            }
        }
        System.out.println(actors.size());
        return actors;
    }

    /**
     * the method bwill darken or lighten the
     * critter depending on if it is a
     * critter or not
     * location, row col
     * <br />
     * Postcondition: (1) The state of all actors in the grid other than this
     * critter and the elements of <code>actors</code> is unchanged. (2) The
     * location of this critter is unchanged.
     * 
     * @param actors the actors to be processed
     * 
     *               for each actor actr in actor, if actr is an instance of a
     *               critter
     *               then go through the next part of the array list
     *               eating/remove any actors that are not rocks or critters
     */
    public void processActors(ArrayList<Actor> actors) {

        if (actors.size() < courage) {
            lighten();
        } 
        else {
            darken();
        }

    }

    /**
     * changes the red green and blue values
     * adds a darkening factor to each color
     * darkens the color
     */
    private void darken() {
        setColor(getColor().darker());

        // setColor(new Color(red, green, blue));
    }

    /**
     * changes the red green and blue values
     * adds a lightening factor to each color
     * lightens the color
     */
    private void lighten() {
        setColor(getColor().brighter());

        // setColor(new Color(red, green, blue));
    }

}
