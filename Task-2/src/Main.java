
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Main {

	private static Finch Bray = null;

	public static void main(String[] args) throws InterruptedException {
		Bray = new Finch();

		// Increase Blue
		for (int i = 0; i < 256; i++) {
			Bray.setLED(0, 0, i);

		}
		// Decrease Blue
		for (int i = 255; i > 0; i--) {
			Bray.setLED(0, 0, i);

		}
		// Increase Red
		for (int i = 0; i < 256; i++) {
			Bray.setLED(i, 0, 0);

		}
		// Decrease Red
		for (int i = 255; i > 0; i--) {
			Bray.setLED(i, 0, 0);

		}
		// Increase Green
		for (int i = 0; i < 256; i++) {
			Bray.setLED(0, i, 0);

		}
		// Decrease Green
		for (int i = 255; i > 0; i--) {
			Bray.setLED(0, i, 0);

		}

		// Check if level
		while (1 == 1)
			if (Bray.isFinchLevel())
				break;

		// GUI

	}

}
