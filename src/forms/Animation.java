package forms;

public class Animation {

	private Form form;
	private Point center;

	public Animation(Form f, Point center) {
		this.form = f;
		this.center = center;
	}

	public void animate() {
		for (int i = 0; i < 20; i++) {
        	form.rotate(center, -6);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            	System.err.println(ex.getStackTrace());
            }
        }
	}
}
