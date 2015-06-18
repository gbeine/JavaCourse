
/**
 * A Circle.
 */
public class Circle
{
    private int radius;
    private Point center;

    /**
     * Constructor for Circle objects.
     */
    public Circle(Point center, int radius)
    {
        this.center = center;
        this.radius = radius;
    }
    
    public int getRadius()
    {
        return this.radius;
    }
    
    public Point getCenter()
    {
        return this.center;
    }
    
    public void move(int x, int y)
    {
        this.center.move(x, y);
    }
}
