package forms;



/**
 * A simple Line.
 */
public class Line extends Drawable implements Form
{
    private Point p1;
    private Point p2;

    /**
     * Constructor for creating Line objects.
     */
    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getX(int p)
    {
        if (p == 1) {
            return this.p1.getX();
        } else {
            return this.p2.getX();
        }
    }

    public double getY(int p)
    {
        if (p == 1) {
            return this.p1.getY();
        } else {
            return this.p2.getY();
        }
    }

    public void move(int x, int y)
    {
    	this.p1 = this.p1.move(x, y);
    	this.p2 = this.p2.move(x, y);
    }

    public void rotate(Point center, double alpha)
    {
    	this.p1 = this.p1.rotate(center, alpha);
    	this.p2 = this.p2.rotate(center, alpha);
    }

    protected void drawForm()
    {
        this.shape = wb.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
