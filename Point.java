
/**
 * A single Point.
 */
public class Point
{
    private int x;
    private int y;

    /**
     * Constructor for creating Point objects
     */
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
}
