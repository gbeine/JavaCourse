package forms;

public class Polygone extends Drawable implements Form {

	private final Point[] points;

	public Polygone(Point[] p) {
		this.points = p;
	}

	@Override
	protected void drawForm() {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

}
