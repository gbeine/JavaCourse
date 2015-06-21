package forms;

public class Triangle extends Polygone {

	public Triangle(Point p1, Point p2, Point p3) {
		super(new Point[] {p1, p2, p3});
	}

	public Point getA() {
		return this.getPoint(0);
	}

	public Point getB() {
		return this.getPoint(1);
	}

	public Point getC() {
		return this.getPoint(2);
	}
}
