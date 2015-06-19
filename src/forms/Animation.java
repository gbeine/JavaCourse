package forms;

public class Animation {

	private Form form;
	private Command command;

	public Animation(Form f) {
		this.form = f;
	}

	public void setCommand(Command c) {
		this.command = c;
	}

	public void animate() {
		for (int i = 0; i < 20; i++) {
			command.animate();
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
