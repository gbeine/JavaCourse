package forms;

public class Rectangle extends Polygone {

    public Rectangle(Point p1, Point p3) {
        super(new Point[] {
                        p1,
                        new Point(p3.getX(), p1.getY()),
                        p3,
                        new Point(p1.getX(), p3.getY()) }
        );
    }
}
