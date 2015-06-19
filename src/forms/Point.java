package forms;


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
        this(0, 0);
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

    public Point move(int x, int y)
    {
        return new Point(this.x + x, this.y + y);
    }

    public Point rotate(Point center, double alpha)
    {
        double xv = this.x - center.getX();
        double yv = this.y - center.getY();

        double radian = Math.toRadians(alpha);
        double tx = xv * Math.cos(radian) -
                    yv * Math.sin(radian);
        double ty = xv * Math.sin(radian) +
                    yv * Math.cos(radian);

        xv = tx + center.getX();
        yv = ty + center.getY();

        return new Point((int)xv, (int)yv);
    }
}
