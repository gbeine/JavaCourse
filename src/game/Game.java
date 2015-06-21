package game;

import java.util.Set;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import teaching.WhiteBoard;
import forms.Animation;
import forms.Command;
import forms.Form;
import forms.ThreadedAnimation;

public class Game {

	public static void main(String[] args) {

		Cockpit cockpit = createCockpit();
		WhiteBoard wb = new WhiteBoard();
		SpaceShip ship = new SpaceShip(wb);
		cockpit.addDirectionListener(ship);
		cockpit.addSpeedListener(ship);

		createMovingAsteroids(wb);

		while (true) {
			ship.fly();
			try {
				Thread.sleep(1000 / SpaceShip.FRAMERATE);
			} catch (InterruptedException e) {
			}
		}
	}

	private static void createMovingAsteroids(WhiteBoard wb) {
		Set<Form> asteroids = AsteroidFactory.createAsteroids();
		for (Form asteroid : asteroids) {
			asteroid.draw(wb);
            Animation a = new Animation(asteroid, 30);

            int speed = (int) (Math.random() * -20);
            Command c = a.new Move(0, speed);
            a.addCommand(c, 0);
            ThreadedAnimation ta = new ThreadedAnimation(a);
            ta.start();

		}

	}

	private static Cockpit createCockpit() {
		Cockpit cockpit = new Cockpit();

		JFrame frame = new JFrame();
		frame.getContentPane().add(cockpit);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		return cockpit;
	}
}
