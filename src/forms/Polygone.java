package forms;

public class Polygone extends Drawable implements Form {

	private final Point[] points;

	public Polygone(Point[] p) {
		this.points = p;
	}

	@Override
	protected void drawForm() {
        double[] x = new double[this.points.length];
        double[] y = new double[this.points.length];

        for (int i = 0; i < this.points.length; i++) {
                x[i] = this.points[i].getX();
                y[i] = this.points[i].getY();
        }

        this.shape = this.wb.drawPolygon(x, y);
	}

	public int numberOfPoints() {
		return this.points.length;
	}

	public Point getPoint(int i) {
		return this.points[i];
	}

	@Override
	public void move(int dx, int dy) {
		for (int i = 0; i < this.points.length; i++) {
			this.points[i] = this.points[i].move(dx, dy);
		}
	}

	@Override
	public void rotate(Point center, double alpha) {
		for (int i = 0; i < this.points.length; i++) {
			this.points[i] = this.points[i].rotate(center, alpha);
		}
	}

	@Override
	public Point getCenter() {
		double x = 0, y = 0;
		for (int i = 0; i < this.points.length; i++) {
			x += this.points[i].getX();
			y += this.points[i].getY();
		}
		x /= this.points.length;
		y /= this.points.length;

        return new Point(x, y);
 	}
}
