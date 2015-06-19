package forms;

import java.util.HashMap;
import java.util.Map;

public class Animation {

	private Form form;
	private int frames;

	private Map<Integer, Command> commands = new HashMap<Integer, Command>();
	private Command currentCommand = new DoNothing();

	public Animation(Form f, int frames) {
		this.form = f;
		this.frames = frames;
	}

	public void addCommand(Command c, int frame) {
		this.commands.put(frame, c);
	}

	public void animate() {
		for (int i = 0; i < frames; i++) {
			if (this.commands.containsKey(i)) {
				this.currentCommand = this.commands.get(i);
			}
			this.currentCommand.animate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            	System.err.println(ex.getStackTrace());
            }
        }
	}

	public class Move implements Command {
		private int dx;
		private int dy;

		public Move(int dx, int dy) {
			this.dx = dx;
			this.dy = dy;
		}

		public void animate() {
			Animation.this.form.move(dx, dy);
		}
	}

	public class Rotate implements Command {
		private Point center;
		private double alpha;

		public Rotate(Point center, double alpha) {
			this.center = center;
			this.alpha = alpha;
		}

		public void animate() {
			Animation.this.form.rotate(center, alpha);
		}
	}
}
