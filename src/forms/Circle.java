package forms;


/**
 * A Circle.
 */
public class Circle extends Drawable implements Form
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
    	this.center = this.center.move(x, y);
    	this.refresh();
    }

    public void rotate(Point center, double alpha)
    {
    	this.center = this.center.rotate(center, alpha);
    	this.refresh();
    }

    public void rotate(double alpha) {
    	// nothing to do here
    }

    protected void drawForm()
    {
        this.shape = this.wb.drawEllipse(center.getX(), center.getY(), radius, radius);
    }
}
