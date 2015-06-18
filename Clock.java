
import teaching.WhiteBoard;

public class Clock
{

    public static void main(String[] args)
    {
        WhiteBoard wb = new WhiteBoard();
        
        Figure clock = new Figure();
        Point center = new Point(300, 200);
        Circle c = new Circle(center, 200);
        
        clock.add(c);
        
        Point p1 = new Point(300, 390);
        Point p2 = new Point(300, 400);
        Line l = new Line(p1, p2);
        
        clock.add(l);
        
        clock.draw(wb);        
    }
}
