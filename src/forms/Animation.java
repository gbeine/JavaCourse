package forms;

public class Animation {

	private Form form;

	public Animation(Form f) {
		this.form = f;
	}

	public void animate(Point center) {
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
