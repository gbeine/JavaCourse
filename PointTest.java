

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Die Test-Klasse PointTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PointTest
{

    @Test
    public void create()
    {
        Point p = new Point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void createWithParameters()
    {
        Point p = new Point(1, 5);
        assertEquals(1, p.getX());
        assertEquals(5, p.getY());
    }

    @Test
    public void move()
    {
        Point p = new Point(1,1);
        p.move(2,2);
        assertEquals(3, p.getX());
        assertEquals(3, p.getY());
    }

    @Test
    public void ratate()
    {
        Point p = new Point(100,0);
        Point c = new Point();
        p.rotate(c, 90);
        assertEquals(0, p.getX());
        assertEquals(100, p.getY());
    }
}
