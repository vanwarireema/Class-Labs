import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;

/**
 * finds the perimter of a polygon along with area
 * then draws it
 *
 * @author  Reema Vanwari
 * @version 11/17/23
 *
 * @author  Period - 1
 * @author  Assignment - Irregular Polygon
 * 
 * @author  Sources - None
 */
public class IrregularPolygon
{
    private DrawingTool pen; 
    private ArrayList<Point2D.Double> myPolygon;

    //constuctors
    
    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
    }

    // public methods
    /**
     * 
     * adds points to the polygon
     * @param point where a point is
     */
    public void add( Point2D.Double point )
    {
        myPolygon.add( point );
    }
    /**
     * 
     * calculates the distance between 2 points using the distance formula
     * @param point1 which is the first point 
     * @param point2 and the second point 
     * @return then finds the disrance between them using square roots
     */
    private double distance( Point2D.Double point1, Point2D.Double point2 )
    {
        return Math.sqrt( Math.pow( ( point2.x - point1.x ), 2 )
            + Math.pow( ( point2.y - point1.y ), 2 ) );
    }

    /**
     * 
     * Gets the perimeter of the polygon using the 
     * distance method
     * @return
     */
    public double perimeter()
    {
        if ( myPolygon.size() < 3 )
        {
            return 0;
        }
        
        double per = 0;
        
        for ( int n = 0; n < myPolygon.size() - 1; n++ )
        {
            per += distance( myPolygon.get( n ), myPolygon.get( n + 1 ) );
        }
        
        per += distance( myPolygon.get( myPolygon.size() - 1 ), myPolygon.get( 0 ) );
        
        return per;
    }

    /**
     * Calculates are by using the weird method from the lab
     * @return area
     */
    public double area()
    {
        if ( myPolygon.size() < 3 )
        {
            return 0;
        }
        
        double area = 0;
        
        for ( int n = 0; n < myPolygon.size() - 1; n++ )
        {
            area += myPolygon.get( n ).x * myPolygon.get( n + 1 ).y;
        }
        
        area += myPolygon.get( myPolygon.size() - 1 ).x * myPolygon.get( 0 ).y;
        
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            area -= myPolygon.get( i ).y * myPolygon.get( i + 1 ).x;
        }
        
        area -= myPolygon.get( myPolygon.size() - 1 ).y * myPolygon.get( 0 ).x;
        
        area = Math.abs( area / 2 );
        
        return area;
    }

    /**
     * draws the polygon
     *
     */
    public void draw()
    {
        if ( myPolygon.size() < 3 )
        {
            return;
        }
        
        pen.up();
        pen.move( myPolygon.get( 0 ).getX(), myPolygon.get( 0 ).getY() );
        pen.down();
        
        for ( int i = 1; i < myPolygon.size(); i++ )
        {
            pen.move( myPolygon.get( i ).getX(), myPolygon.get( i ).getY() );
        }
        
        pen.move( myPolygon.get( 0 ).getX(), myPolygon.get( 0 ).getY() );
    }
}