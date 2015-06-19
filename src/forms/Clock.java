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

        Point p1 = new Point(300, 390);
        Point p2 = new Point(300, 400);

        for ( int i = 0; i < 12; i++) {
            Line l = new Line(p1, p2);
            clock.add(l);
            p1 = p1.rotate(center, 30);
            p2 = p2.rotate(center, 30);
        }

        clock.draw(wb);

        Line pointer = new Line(center, new Point(300, 370));
        pointer.draw(wb);

        for (int i = 0; i < 20; i++) {
        	pointer.rotate(center, -6);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            	System.err.println(ex.getStackTrace());
            }
        }
    }
}
