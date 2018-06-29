//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot moby = new Robot();
		moby.setSpeed(10000000);
		moby.penDown();
		moby.hide();
		// 3. Ask the user what color they would like the robot to draw
		for (int repeat = 0; repeat < 20; repeat++) {
			String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
			// 5. Use an if/else statement to set the pen color that the user requested

			if (color.equals("red")) {
				moby.setPenColor(239, 76, 42);
			} else if (color.equals("green")) {
				moby.setPenColor(29, 169, 65);
			} else if (color.equals("blue")) {
				moby.setPenColor(11, 97, 168);
			} else if (color.equals("pink")) {
				moby.setPenColor(168, 11, 146);
			} else {
				moby.setRandomPenColor();
			}

			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			moby.setPenWidth(10);
			moby.move(30);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			for (int square = 0; square < 4; square++) {
				moby.move(40);
				moby.turn(360/9);
			}
		}
	}
}
