import com.cyberbotics.webots.controller.Robot;

public class BasicController {

	int TIME_STEP = 64;

	public static void main(String[] args) {

		Robot robot = new Robot();

		while (robot.step(timeStep) != -1) {
			// Your code here

		}
	}
}

