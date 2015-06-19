package forms;

import forms.Animation.Rotate;
import teaching.WhiteBoard;

public class Clock {

	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();

		Figure clock = new Figure();
		Point center = new Point(300, 200);
		Circle c = new Circle(center, 200);

		clock.add(c);

		Point p1 = new Point(300, 390);
		Point p2 = new Point(300, 400);

		for (int i = 0; i < 12; i++) {
			Line l = new Line(p1, p2);
			clock.add(l);
			p1 = p1.rotate(center, 30);
			p2 = p2.rotate(center, 30);
		}

		clock.draw(wb);

		Line pointer = new Line(center, new Point(300, 370));
		pointer.draw(wb);

		Line pointer2 = new Line(center, new Point(300, 320));
		pointer2.draw(wb);

		Animation a = new Animation(pointer, 20);
		Rotate r = a.new Rotate(center, -6);
		a.addCommand(r, 0);

		Animation a2 = new Animation(pointer2, 20);
		Rotate r2 = a2.new Rotate(center, -1);
		a2.addCommand(r2, 0);

		new ThreadedAnimation(a).start();
		new ThreadedAnimation(a2).start();
	}
}
