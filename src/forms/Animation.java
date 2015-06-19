package forms;

public class Animation {

	public static void animate(Point center, Line pointer) {
		for (int i = 0; i < 20; i++) {
        	pointer.rotate(center, -6);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            	System.err.println(ex.getStackTrace());
            }
        }
	}
}
