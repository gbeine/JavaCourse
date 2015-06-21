package forms;



import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A test class for Line objects.
 */
public class LineTest
{
    @Test
    public void createLine()
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 5);
        Line l = new Line(p1, p2);
        assertEquals(1, l.getX(1), 0.0000001);
        assertEquals(2, l.getY(1), 0.0000001);
        assertEquals(1, l.getX(2), 0.0000001);
        assertEquals(5, l.getY(2), 0.0000001);
    }

    @Test
    public void moveLine()
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 5);
        Line l = new Line(p1, p2);
        l.move(3, 3);
        assertEquals(4, l.getX(1), 0.0000001);
        assertEquals(5, l.getY(1), 0.0000001);
        assertEquals(4, l.getX(2), 0.0000001);
        assertEquals(8, l.getY(2), 0.0000001);
    }

    @Test
    public void center() {
    	Point p1 = new Point(-3, -3);
    	Point p2 = new Point(3, 3);
        Line l = new Line(p1, p2);
        Point p = l.getCenter();

        assertEquals(0.0, p.getX(), 0.0000001);
        assertEquals(0.0, p.getY(), 0.0000001);

    }
}
