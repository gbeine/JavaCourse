package game;

import teaching.WhiteBoard;
import forms.Circle;
import forms.Point;

public class AsteroidFactory {


	public static int COUNT = 10;

	private static final int RADIUS_FACTOR = 10;
	private static final int RADIUS_MINIMUM = 10;

    private static final int X_FACTOR = 600;
    private static final int X_POSITION = 30;

    private static final int Y_FACTOR = 50;
    private static final int Y_POSITION = 500;

	public static void createAsteroids(WhiteBoard wb) {

		for (int i = 0; i < COUNT; i++) {
            int radius = RADIUS_MINIMUM + (int) (Math.random() * RADIUS_FACTOR);

            int x = X_POSITION + (int) (Math.random() * X_FACTOR);
            int y = Y_POSITION + (int) (Math.random() * Y_FACTOR);
			Point center = new Point(x, y);

			Circle asteroid = new Circle(center, radius);
			asteroid.draw(wb);
		}

	}
}
