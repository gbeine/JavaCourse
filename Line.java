
import teaching.WhiteBoard;

/**
 * A simple Line.
 */
public class Line
{
    private Point p1;
    private Point p2;
    
    private WhiteBoard wb;
    private Object shape;
    
    /**
     * Constructor for creating Line objects.
     */
    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public int getX(int p)
    {
        if (p == 1) {
            return this.p1.getX();
        } else {
            return this.p2.getX();
        }
    }    

    public int getY(int p)
    {
        if (p == 1) {
            return this.p1.getY();
        } else {
            return this.p2.getY();
        }
    }
    
    public void move(int x, int y)
    {
        this.p1.move(x, y);
        this.p2.move(x, y);
    }
    
    public void draw(WhiteBoard wb)
    {
        this.wb = wb;
        this.shape = wb.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
    
    public void remove()
    {
        if (this.wb != null) {
            this.wb.wipeShape(shape);
            this.shape = null;
        }
    }
}
