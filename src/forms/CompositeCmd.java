package forms;

public class CompositeCmd implements Command {

	private final Command action1;
	private final Command action2;

	public CompositeCmd(Command a1, Command a2) {
		this.action1 = a1;
		this.action2 = a2;
	}

	@Override
	public void animate() {
		this.action1.animate();
		this.action2.animate();
	}

}
