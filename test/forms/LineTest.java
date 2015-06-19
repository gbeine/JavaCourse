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
        assertEquals(1, l.getX(1));
        assertEquals(2, l.getY(1));
        assertEquals(1, l.getX(2));
        assertEquals(5, l.getY(2));
    }

    @Test
    public void moveLine()
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 5);
        Line l = new Line(p1, p2);
        l.move(3, 3);
        assertEquals(4, l.getX(1));
        assertEquals(5, l.getY(1));
        assertEquals(4, l.getX(2));
        assertEquals(8, l.getY(2));
    }
}
