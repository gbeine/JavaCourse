package game;

import teaching.WhiteBoard;
import forms.Figure;
import forms.Point;
import forms.Rectangle;
import forms.Triangle;

public class Game {

	public static void main(String[] args) {

		WhiteBoard wb = new WhiteBoard();

		Figure spaceShip = new Figure();

		Point p1 = new Point(100, 100);
		Point p2 = new Point(75, 50);
		Point p3 = new Point(125, 50);
        Triangle d = new Triangle(p1, p2, p3);
        Point p4 = new Point(75, 0);
        Rectangle r = new Rectangle(p4, p3);

        spaceShip.add(d);
        spaceShip.add(r);

        spaceShip.draw(wb);

	}
}
