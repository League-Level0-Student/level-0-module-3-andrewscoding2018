import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {

	String shape = JOptionPane.showInputDialog("Give me a shape.");
	if(shape.equals("Circle"))
	{
		drawCircle();
	}
	else if (shape.equals("Triangle"))
		{
		drawTriangle();
		}
	else if(shape.equals("Square"))
		{
		drawSquare();
		
}
}

	public static void drawSquare() {
		Robot roby = new Robot();
		roby.setSpeed(1000000000);
		roby.penDown();
		roby.hide();
		roby.move(40);
		roby.turn(90);
		roby.move(40);
		roby.turn(90);
		roby.move(40);
		roby.turn(90);
		roby.move(40);
		roby.turn(90);
	}

	public static void drawTriangle() {
		Robot roby = new Robot();
		roby.setSpeed(1000000000);
		roby.penDown();
		roby.hide();
		roby.move(40);
		roby.turn(120);
		roby.move(40);
		roby.turn(120);
		roby.move(40);

	}

	public static void drawCircle() {
		Robot roby = new Robot();
		roby.setSpeed(1000000000);
		roby.penDown();
		roby.hide();
		for (int rep = 9; rep < 1000000000; rep++)
			roby.move(40);
		roby.turn(360 / 1000000000);

	}
}
