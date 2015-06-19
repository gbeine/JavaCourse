package forms;



import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Circle.
 */
public class CircleTest
{
    @Test
    public void createCircle()
    {
        Point center = new Point(1, 2);
        Circle c = new Circle(center, 3);
        assertEquals(3, c.getRadius());
        assertEquals(1, c.getCenter().getX());
        assertEquals(2, c.getCenter().getY());
    }

    @Test
    public void move()
    {
        Point center = new Point(4, 2);
        Circle c = new Circle(center, 2);
        c.move(2, 2);
        assertEquals(6, c.getCenter().getX());
        assertEquals(4, c.getCenter().getY());
    }
}
