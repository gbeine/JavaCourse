package forms;



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
        assertEquals(0, p.getX(), 0.0000001);
        assertEquals(0, p.getY(), 0.0000001);
    }

    @Test
    public void createWithParameters()
    {
        Point p = new Point(1, 5);
        assertEquals(1, p.getX(), 0.0000001);
        assertEquals(5, p.getY(), 0.0000001);
    }

    @Test
    public void move()
    {
        Point p = new Point(1,1);
        Point n = p.move(2,2);
        assertEquals(3, n.getX(), 0.0000001);
        assertEquals(3, n.getY(), 0.0000001);
    }

    @Test
    public void rotate()
    {
        Point p = new Point(100,0);
        Point c = new Point();
        Point n = p.rotate(c, 90);
        assertEquals(0, n.getX(), 0.0000001);
        assertEquals(100, n.getY(), 0.0000001);
    }
}
