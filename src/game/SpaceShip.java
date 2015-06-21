package game;

import teaching.WhiteBoard;
import forms.Figure;
import forms.Form;
import forms.Point;
import forms.Rectangle;
import forms.Triangle;

public class SpaceShip implements Sprite {

	private final WhiteBoard wb;
	private Figure spaceShip;
	private int direction;
	private int speed;

	public SpaceShip(WhiteBoard wb) {
		this.wb = wb;
		initialize();
	}

	private void initialize() {
		this.spaceShip = new Figure();

		Point p1 = new Point(100, 100);
		Point p2 = new Point(75, 50);
		Point p3 = new Point(125, 50);
        Triangle d = new Triangle(p1, p2, p3);
        Point p4 = new Point(75, 0);
        Rectangle r = new Rectangle(p4, p3);

        this.spaceShip.add(d);
        this.spaceShip.add(r);

        this.spaceShip.draw(wb);
	}

	@Override
	public void setDirection(int direction) {
        int alpha = this.direction - direction;
        Point center = spaceShip.getCenter();
        spaceShip.rotate(center, alpha);
        this.direction = direction;
	}

	@Override
	public void setSpeed(int speed) {
        this.speed = speed;
	}
}
