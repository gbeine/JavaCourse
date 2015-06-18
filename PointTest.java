

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
}
