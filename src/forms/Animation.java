package forms;

public class Animation {

	private Form form;
	private Rotate r;

	public Animation(Form f) {
		this.form = f;
	}

	public void setAnimation(Rotate r) {
		this.r = r;
	}

	public void animate() {
		for (int i = 0; i < 20; i++) {
			r.animate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            	System.err.println(ex.getStackTrace());
            }
        }
	}

	public class Rotate {
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
