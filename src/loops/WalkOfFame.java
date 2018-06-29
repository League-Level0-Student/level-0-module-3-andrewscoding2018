
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(150);
		rob.setY(350);
		rob.hide();
		rob.setSpeed(100000);
		rob.penDown();
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int repeat = 0; repeat < 5; repeat++) {
			rob.setAngle(36);
			rob.move(60);
			rob.turn(144);
			rob.move(60);
			rob.turn(144);
			rob.move(60);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
