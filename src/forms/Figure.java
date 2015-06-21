package forms;

import java.util.Set;
import java.util.HashSet;

public class Figure implements Form {

	private Set<Form> forms;

	public Figure() {
		forms = new HashSet<Form>();
	}

	public void add(Form f) {
		forms.add(f);
	}

	public void move(int dx, int dy) {
		for (Form f : forms) {
			f.move(dx, dy);
		}
	}

	public void rotate(Point center, double alpha) {
		for (Form f : forms) {
			f.rotate(center, alpha);
		}
	}

	public void draw(teaching.WhiteBoard wb) {
		for (Form f : forms) {
			f.draw(wb);
		}
	}

	public void remove() {
		for (Form f : forms) {
			f.remove();
		}
	}

	@Override
	public void rotate(double alpha) {
		final Point center = this.getCenter();
		for (Form f : forms) {
			f.rotate(center, alpha);
		}
	}

	@Override
	public Point getCenter() {
		double x = 0, y = 0;

		for (Form form : this.forms) {
			x += form.getCenter().getX();
			y += form.getCenter().getY();
		}

		return new Point(x / this.forms.size(), y / this.forms.size());
	}
}
