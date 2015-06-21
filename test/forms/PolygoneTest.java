package forms;



import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Circle.
 */
public class PolygoneTest
{
    @Test
    public void createPolygone()
    {
        Point p1 = new Point(100,100);
        Point p2 = new Point(200,100);
        Point p3 = new Point(250,150);
        Point p4 = new Point(200,200);
        Point p5 = new Point(100,200);

        Polygone p = new Polygone(new Point[]{p1, p2, p3, p4, p5});

        assertEquals(5, p.numberOfPoints());
    }

    @Test
    public void move()
    {
        Point p1 = new Point(100,100);
        Point p2 = new Point(200,100);
        Point p3 = new Point(250,150);
        Point p4 = new Point(200,200);
        Point p5 = new Point(100,200);

        Polygone p = new Polygone(new Point[]{p1, p2, p3, p4, p5});

        p.move(200,200);

        // Just for the first and the last point
        assertEquals(300.0, p.getPoint(0).getX(), 0.0000001);
        assertEquals(300.0, p.getPoint(0).getY(), 0.0000001);
        assertEquals(450.0, p.getPoint(2).getX(), 0.0000001);
        assertEquals(350.0, p.getPoint(2).getY(), 0.0000001);
        assertEquals(300.0, p.getPoint(4).getX(), 0.0000001);
        assertEquals(400.0, p.getPoint(4).getY(), 0.0000001);
    }
}
