package game;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import teaching.WhiteBoard;

public class Game {

	public static void main(String[] args) {

		Cockpit cockpit = createCockpit();
		WhiteBoard wb = new WhiteBoard();
		SpaceShip ship = new SpaceShip(wb);
		cockpit.addDirectionListener(ship);
		cockpit.addSpeedListener(ship);

		AsteroidFactory.createAsteroids(wb);

		while (true) {
			ship.fly();
			try {
				Thread.sleep(1000 / SpaceShip.FRAMERATE);
			} catch (InterruptedException e) {
			}
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
