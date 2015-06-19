package forms;

import java.util.ArrayList;
import java.util.List;

public class Animation {

	private Form form;
	private int frames;

	private List<Command> commands = new ArrayList<Command>();

	public Animation(Form f, int frames) {
		this.form = f;
		this.frames = frames;
	}

	public void addCommand(Command c) {
		this.commands.add(c);
	}

	public void animate() {
		for (int i = 0; i < frames; i++) {
			this.commands.get(i).animate();
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
