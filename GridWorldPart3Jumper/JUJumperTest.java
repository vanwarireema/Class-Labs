import info.gridworld.actor.*;
import info.gridworld.grid.*;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Jumper tests:.
 *  test01 - jumper next to edge of grid - should turn
 *  test02 - jumper 2 from edge of grid - should turn
 *  test03 - jumper jumping on edible - should jump
 *  test04 - jumper jumping on non-edible/flower/rock - should turn
 *  test05 - jumper jumping on empty square (prev square a flower) - should jump
 *
 *  @author  Chang, Reema
 *  @version 10/31/2023
 *
 *  @author  Period: 1
 *  @author  Assignment - GridWorld Part 3 Jumper
 *
 *  @author  Sources: none
 */
public class JUJumperTest
{
    /*
     * Variables used by the test methods.
     */
    private Grid<Actor> grid;
    private ActorWorld world;
    private Jumper jumper1;

    /**
     * Invoked before each test to instantiate the objects
     * used for every test.
     */
    @Before public void initialize()
    {
        grid = new BoundedGrid<Actor>(8, 8);
        world = new ActorWorld(grid);
        jumper1 = new Jumper();
    }

    /**
     * test01 - jumper next to edge of grid - should turn
     */
    @Test
    public void jumperNextToEdgeOfGridShouldTurn()
    {
        Location loc = new Location(0, 3);
        world.add(loc, jumper1);
        jumper1.act();

        assertTrue(testOccupied(loc, jumper1, Location.NORTHEAST));
    }

    /**
     * test02 - jumper 2 from edge of grid - should turn.
     */
    @Test
    public void jumper2FromEdgeOfGridShouldTurn()
    {
        Location loc = new Location(1, 3);
        world.add(loc, jumper1);
        jumper1.act();

        assertTrue(testOccupied(loc, jumper1, Location.NORTHEAST));
    }

    /**
     * test03 - jumper jumping on edible - should jump
     */
    @Test
    public void test03()
    {
        Location loc = new Location(2, 0);
        Location loc2 = new Location(0, 0);
        world.add(loc, jumper1);
        Jumper reema = new Jumper();
        world.add(loc2, reema);
        jumper1.act();
        assertTrue(testOccupied(loc2, jumper1, Location.NORTH));
    }

    /**
     * test04 - jumper jumping on non-edible/flower/rock - should turn
     */
    @Test
    public void test04()
    {
        Location loc = new Location(2, 0);
        Location loc2 = new Location(0, 0);
        world.add(loc, jumper1);
        Flower reema = new Flower();
        world.add(loc2, reema);
        jumper1.act();
        assertTrue(testOccupied(loc, jumper1, Location.NORTHEAST));
    }
    

    /**
     * test05 - jumper jumping on empty square (prev square a flower) - should jump
     */
    @Test
    public void test05()
    {
        Location loc = new Location(2, 0);
        Location loc2 = new Location(1, 0);
        Location loc3 = new Location(0, 0);
        world.add(loc, jumper1);
        Flower reema = new Flower();
        world.add(loc2, reema);
        jumper1.act();
        assertTrue(testOccupied(loc3, jumper1, Location.NORTH));
    }


    /**
     * Test helper method to test for empty location.
     *
     * @param loc null location if empty
     * @return true if all assertions pass
     */
    private boolean testEmpty(Location loc)
    {
        Actor empty = grid.get( loc );
        assertNull( "<<<<< " + loc + " should be empty. >>>>>", empty );

        return true;
    }

    /**
     * Test helper method to test that object is in a location, and has
     * a consistent loc, and direction dir.
     *
     * @param loc location that should be occupied
     * @param a   actor that should be in location loc
     * @param dir direction this actor should be facing
     * @return true if all assertions pass
     */
    private boolean testOccupied(Location loc, Actor a, int dir)
    {
        Actor found = grid.get( loc );
        assertSame( "<<<<< " + loc + " should contain the actor. >>>>>",
            a, found );
        assertEquals( "<<<<< Loc should be " + loc + " >>>>>",
            loc, found.getLocation() );
        assertEquals( "<<<<< Dir should be " + dir + " >>>>>",
            dir, found.getDirection() );

        return true;
    }
}