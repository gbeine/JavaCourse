package forms;


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

        for ( int i = 0; i < 12; i++) {
            Point p1 = new Point(300, 390);
            p1.rotate(center, 30*i);
            Point p2 = new Point(300, 400);
            p2.rotate(center, 30*i);
            Line l = new Line(p1, p2);
            clock.add(l);
        }

        clock.draw(wb);
    }
}
