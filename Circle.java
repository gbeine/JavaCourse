
import teaching.WhiteBoard;

/**
 * A Circle.
 */
public class Circle extends Drawable
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
    
    public void draw(WhiteBoard wb)
    {
        if (this.wb != null) {
            remove();
        }
        this.wb = wb;
        this.shape = this.wb.drawEllipse(center.getX(), center.getY(), radius, radius);
    }
    
    public void remove()
    {
        if (this.wb != null) {
            this.wb.wipeShape(shape);
            this.shape = null;
        }
    }
}
