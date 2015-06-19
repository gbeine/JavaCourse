package forms;

public class ThreadedAnimation implements Runnable {

	private Animation animation;

	public ThreadedAnimation(Animation a) {
		this.animation = a;
	}

	@Override
	public void run() {
		this.animation.animate();
	}

	public void start() {
		Thread t = new Thread(this);
		t.start();
	}

}
