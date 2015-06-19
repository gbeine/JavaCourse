package forms;

public class DoNothing implements Command {

	public static final DoNothing INSTANCE = new DoNothing();

	private DoNothing() {
	}

	@Override
	public void animate() {
	}

}
