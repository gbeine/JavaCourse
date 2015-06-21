package game;

import teaching.WhiteBoard;
import forms.Circle;
import forms.Point;

public class AsteroidFactory {

	public static int COUNT = 10;

	public static void createAsteroids(WhiteBoard wb) {

		for (int i = 0; i < COUNT; i++) {
			Point center = new Point();
			Circle asteroid = new Circle(center, 10);
			asteroid.draw(wb);
		}

	}
}
